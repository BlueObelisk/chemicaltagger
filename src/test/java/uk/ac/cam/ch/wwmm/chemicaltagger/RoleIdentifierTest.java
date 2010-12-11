package uk.ac.cam.ch.wwmm.chemicaltagger;

import static uk.ac.cam.ch.wwmm.chemicaltagger.Utils.readSentence;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import org.junit.Test;

public class RoleIdentifierTest {

	@Test
	public void RoleIdentifierTest1() throws UnsupportedEncodingException {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence1.txt");
		;
		RoleIdentifier roleIdent = new RoleIdentifier();
		roleIdent.setText(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest2() throws UnsupportedEncodingException {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence2.txt");
		;
		RoleIdentifier roleIdent = new RoleIdentifier();
		roleIdent.setText(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest3() throws UnsupportedEncodingException {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence3.txt");
		;
		RoleIdentifier roleIdent = new RoleIdentifier();
		roleIdent.setText(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest4() throws UnsupportedEncodingException {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence4.txt");
		;
		RoleIdentifier roleIdent = new RoleIdentifier();
		roleIdent.setText(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest5() throws UnsupportedEncodingException {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence5.txt");
		;
		RoleIdentifier roleIdent = new RoleIdentifier();
		roleIdent.setText(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest6() throws UnsupportedEncodingException {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence6.txt");
		;
		RoleIdentifier roleIdent = new RoleIdentifier();
		roleIdent.setText(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest7() throws UnsupportedEncodingException {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence7.txt");
		;
		RoleIdentifier roleIdent = new RoleIdentifier();
		roleIdent.setText(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest8() throws UnsupportedEncodingException {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence8.txt");
		;
		RoleIdentifier roleIdent = new RoleIdentifier();
		roleIdent.setText(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest9() throws UnsupportedEncodingException {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence9.txt");
		;
		RoleIdentifier roleIdent = new RoleIdentifier();
		roleIdent.setText(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest10() throws UnsupportedEncodingException {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence10.txt");
		;
		RoleIdentifier roleIdent = new RoleIdentifier();
		roleIdent.setText(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);
	}

}
