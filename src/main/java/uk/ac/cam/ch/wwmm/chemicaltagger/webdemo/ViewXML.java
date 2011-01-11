package uk.ac.cam.ch.wwmm.chemicaltagger.webdemo;

import java.io.IOException;

import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class ViewXML extends ServerResource {

	/**
	 * @author sea36
	 * @author dmj30
	 * @author lh359
	 */

	@Post("form:txt")
	public Representation doForm(Form form) throws IOException {
		String xml = "<doc>Empty Document</doc>";
		if (form != null)
			xml = form.getFirstValue("xml");

		
		System.out.println("**********" + xml);
		return new StringRepresentation(xml, MediaType.APPLICATION_XML);

	}
}