package uk.ac.cam.ch.wwmm.chemicaltagger;

import static uk.ac.cam.ch.wwmm.chemicaltagger.Utils.readSentence;

import java.io.UnsupportedEncodingException;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import uk.ac.cam.ch.wwmm.chemicaltagger.roles.NamedEntityWithRoles;
import uk.ac.cam.ch.wwmm.chemicaltagger.roles.Role;
import uk.ac.cam.ch.wwmm.chemicaltagger.roles.RoleIdentifier;

public class RoleIdentifierTest {

	private static Logger LOG = Logger.getLogger(RoleIdentifierTest.class);

	@Test
	public void RoleIdentifierTest1() throws UnsupportedEncodingException {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence1.txt");
		RoleIdentifier roleIdent = new RoleIdentifier();
		Collection<NamedEntityWithRoles> identifiedRoles = roleIdent.getRoles(sentence);
		int solventCount = getSolventCount(identifiedRoles);
		Assert.assertEquals("Solvent Count", 1, solventCount);
		LOG.info(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest2() throws UnsupportedEncodingException {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence2.txt");
		RoleIdentifier roleIdent = new RoleIdentifier();
		Collection<NamedEntityWithRoles> identifiedRoles = roleIdent.getRoles(sentence);
		int solventCount = getSolventCount(identifiedRoles);
		Assert.assertEquals("Solvent Count", 1, solventCount);
		LOG.info(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest3() throws UnsupportedEncodingException {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence3.txt");
		RoleIdentifier roleIdent = new RoleIdentifier();
		Collection<NamedEntityWithRoles> identifiedRoles = roleIdent.getRoles(sentence);
		int solventCount = getSolventCount(identifiedRoles);
		Assert.assertEquals("Solvent Count", 2, solventCount);
		LOG.info(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest4() throws UnsupportedEncodingException {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence4.txt");
		RoleIdentifier roleIdent = new RoleIdentifier();
		Collection<NamedEntityWithRoles> identifiedRoles = roleIdent.getRoles(sentence);
		int solventCount = getSolventCount(identifiedRoles);
		Assert.assertEquals("Solvent Count", 1, solventCount);
		LOG.info(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest5() throws UnsupportedEncodingException {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence5.txt");
		RoleIdentifier roleIdent = new RoleIdentifier();
		Collection<NamedEntityWithRoles> identifiedRoles = roleIdent.getRoles(sentence);
		int solventCount = getSolventCount(identifiedRoles);
		Assert.assertEquals("Solvent Count", 3, solventCount);
		LOG.info(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest6() throws UnsupportedEncodingException {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence6.txt");
		RoleIdentifier roleIdent = new RoleIdentifier();
		Collection<NamedEntityWithRoles> identifiedRoles = roleIdent.getRoles(sentence);
		int solventCount = getSolventCount(identifiedRoles);
		Assert.assertEquals("Solvent Count", 1, solventCount);
		LOG.info(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest7() throws UnsupportedEncodingException {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence7.txt");
		RoleIdentifier roleIdent = new RoleIdentifier();
		Collection<NamedEntityWithRoles> identifiedRoles = roleIdent.getRoles(sentence);
		int solventCount = getSolventCount(identifiedRoles);
		Assert.assertEquals("Solvent Count", 1, solventCount);
		LOG.info(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest8() throws UnsupportedEncodingException {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence8.txt");
		RoleIdentifier roleIdent = new RoleIdentifier();
		Collection<NamedEntityWithRoles> identifiedRoles = roleIdent.getRoles(sentence);
		int solventCount = getSolventCount(identifiedRoles);
		Assert.assertEquals("Solvent Count", 4, solventCount);
		LOG.info(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest9() throws UnsupportedEncodingException {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence9.txt");
		RoleIdentifier roleIdent = new RoleIdentifier();
		Collection<NamedEntityWithRoles> identifiedRoles = roleIdent.getRoles(sentence);
		int solventCount = getSolventCount(identifiedRoles);
		Assert.assertEquals("Solvent Count", 4, solventCount);
		LOG.info(identifiedRoles);
	}

	@Test
	public void RoleIdentifierTest10() throws UnsupportedEncodingException {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/roleIdentifierTest/Sentence10.txt");
		RoleIdentifier roleIdent = new RoleIdentifier();
		Collection<NamedEntityWithRoles> identifiedRoles = roleIdent.getRoles(sentence);
		int solventCount = getSolventCount(identifiedRoles);
		Assert.assertEquals("Solvent Count", 0, solventCount);
		LOG.info(identifiedRoles);
	}

	private int getSolventCount(Collection<NamedEntityWithRoles> identifiedRoles) {
		int count = 0;
		for (NamedEntityWithRoles entity : identifiedRoles) {
			for (Role role : entity.getRoles()) {
				if (!role.getRole().equals("None")) {
					count += 1;
					break;
				}
			}
		}
		return count;
	}
}
