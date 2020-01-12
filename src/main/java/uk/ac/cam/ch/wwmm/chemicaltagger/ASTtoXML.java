/**
 * Copyright 2012 Lezan Hawizy, David M. Jessop, Daniel Lowe and Peter Murray-Rust
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.HashMap;

import nu.xom.Document;
import nu.xom.Element;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.Tree;

import uk.ac.cam.ch.wwmm.chemicaltagger.pregenerated.ChemicalChunkerParser;

/*****************************
 * Converts ANTLR ASTTrees into XML Documents.
 * 
 * @author lh359
 *****************************/

public class ASTtoXML {

	private static final String[] defaultTokenNames = ChemicalChunkerParser.tokenNames;
	private static final String[] defaultNestingTagNames = new String[ChemicalChunkerParser.ruleNames.length];
	
	static {
		defaultNestingTagNames[ChemicalChunkerParser.RULE_sentence] = "Sentence";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_unmatchedPhrase] = "Unmatched";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_procedureNounPhrase] = "NounPhrase";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_nounphrase] = "NounPhrase";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_multiApparatus] = "MultipleApparatus";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_dissolvePhrase] = "DissolvePhrase";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_verbphrase] = "VerbPhrase";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_cycles] = "CYCLES";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_ratio] = "RATIO";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_citationStructure] = "CITATION";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_bracketedContent] = "MIXTURE";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_bracketedContentInMol] = "MIXTURE";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_prepphraseIN] = "PrepPhrase";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_prepphraseOther] = "PrepPhrase";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_prepphraseOf] = "PrepPhrase";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_prepphraseAfter] = "PrepPhrase";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_prepphraseTime] = "TimePhrase";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_prepphraseRole] = "RolePrepPhrase";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_prepphraseAtmosphere] = "AtmospherePhrase";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_prepphraseTemp] = "TempPhrase";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_amount] = "AMOUNT";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_mass] = "MASS";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_percent] = "PERCENT";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_volume] = "VOLUME";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_molar] = "MOLAR";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_logHydrogenActivity] = "PH";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_equivalent] = "EQUIVALENT";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_yield] = "YIELD";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_apparatus] = "APPARATUS";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_multiple] = "MULTIPLE";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_oscarCompoundStructure] = "OSCARCM";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_molecule] = "MOLECULE";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_unnamedmolecule] = "UNNAMEDMOLECULE";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_quantity1Node] = "QUANTITY";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_quantity2Node] = "QUANTITY";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_headingProcedureRequiringTerminator] = "PROCEDURE";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_bracketedHeadingProcedure] = "PROCEDURE";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_procedureNode] = "PROCEDURE";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_alphanumericOrIdentifierCompoundReference] = "REFERENCETOCOMPOUND";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_numberCompoundReference] = "REFERENCETOCOMPOUND";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_numericOrIdentifierCompoundReference] = "REFERENCETOCOMPOUND";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_referenceToExampleCompound] = "REFERENCETOCOMPOUND";
		defaultNestingTagNames[ChemicalChunkerParser.RULE_captionLabel] = "CaptionLabel";
	}
	
	private final String[] tokenNames;
	private final String[] nestingTagNames;

	/********************************************
	 * Default constructor method.
	 *******************************************/
	public ASTtoXML() {
	  this(defaultTokenNames, defaultNestingTagNames);
	}

	public ASTtoXML(String[] tokenNames, String[] nestingTagNames) {
		this.tokenNames = tokenNames;
		this.nestingTagNames = nestingTagNames;
	}

  /********************************************
	 * Overloading Method that converts astTree to XML Document with
	 * ActionPhrases Included.
	 * 
	 * @param astTree
	 *            (Tree)
	 * 
	 * @return doc (Document)
	 *******************************************/
	public Document convert(Tree astTree) {

		return convert(astTree, true);
	}

	/********************************************
	 * Converts AST Trees to XML Document.
	 * 
	 * @param astTree
	 *            (Tree)
	 * @param annotateActionPhrases
	 *            (boolean)
	 * @return doc (Document)
	 *******************************************/
	public Document convert(Tree astTree, boolean annotateActionPhrases) {
		Element root = new Element("Document");
		Document doc;

		if (astTree.getChildCount() > 0) {
			doc = new Document(getNodes(astTree, root));
		} else {
			doc = new Document(root);
		}
		if (annotateActionPhrases) {
			PostProcessTrees procTree = new PostProcessTrees();
			doc = procTree.process(doc);
		}
		return doc;
	}

	/********************************************
	 * Converts astTree to XML Document. Postprocesses the treenodes with a
	 * userdefined hashmap.
	 * 
	 * @param astTree
	 *            (Tree)
	 * @param annotateActionPhrases
	 *            (boolean)
	 * @param actionPhraseDictionary
	 *            (HashMap)
	 * @return doc (Document)
	 *******************************************/
	public Document convert(Tree astTree, boolean annotateActionPhrases,
			HashMap<String, String> actionPhraseDictionary) {

		Element root = new Element("Document");
		Document doc;

		if (astTree.getChildCount() > 0) {
			doc = new Document(getNodes(astTree, root));
		} else {
			doc = new Document(root);
		}
		if (annotateActionPhrases) {
			PostProcessTrees procTree = new PostProcessTrees();
			procTree.setActionMap(actionPhraseDictionary);

			doc = procTree.process(doc);
		}
		return doc;
	}

	/**********************************************
	 * A recursive function that goes through the leaves of the tree to create
	 * XML nodes.
	 * 
	 * @param astTree
	 *            (Tree)
	 * @param node
	 *            (Element)
	 * @return node (Element)
	 **********************************************/
	public Element getNodes(Tree astTree, Element node) {
	    int nodeCount = astTree.getChildCount();
	    
	    Element lastTerminalNode = null;

		for (int i = 0; i < nodeCount; i++) {
			Tree astChild = astTree.getChild(i);
			Object payload = astChild.getPayload();
			if (payload instanceof Token) {
				Token token = (Token) astChild.getPayload();
				String text = token.getText();
				int type = token.getType();
				if (type != Token.INVALID_TYPE) {
					if (tokenNames[type].equals("TOKEN")) {
						if (nodeCount !=2 || lastTerminalNode == null){
							throw new RuntimeException("Bug in ChemicalTagger grammar: Terminal token rules expected to have 2 nodes of the form: 'TokenType' TOKEN");
						}
						lastTerminalNode.appendChild(text);
					} else {
						text = Utils.makeNCName(text);
						Element newNode = new Element(text);
						node.appendChild(newNode);
						lastTerminalNode = newNode;
					}
				}
				else{
					Element unmatched = new Element("UnmatchedPhrase");
					unmatched.appendChild(text);
					node.appendChild(unmatched);
				}
			}
			else if (payload instanceof RuleContext) {
				RuleContext ruleContext = (RuleContext) astChild.getPayload();
				/*
				 * Child count can be 0 if the entire contents of a rule is optional
				 * If this occurs current behaviour is to ignore that it matched to avoid the case of a rule element having no child tokens
				 */
				if (astChild.getChildCount() > 0) { 
					String nestingElementName = nestingTagNames[ruleContext.getRuleIndex()];
					if (nestingElementName != null){
						Element newNode = new Element(nestingElementName);
						node.appendChild(newNode);
						getNodes(astChild, newNode);
					}
					else{
						getNodes(astChild, node);
					}
				}
			}
			else{
				throw new IllegalArgumentException("Unexpected tree data: " + payload.getClass().toString() +" was neither a Token or a RuleContext");
			}
		}
		return node;
	}
}
