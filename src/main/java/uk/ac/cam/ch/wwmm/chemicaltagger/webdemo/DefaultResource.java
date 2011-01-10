package uk.ac.cam.ch.wwmm.chemicaltagger.webdemo;

import java.io.IOException;
import java.util.HashMap;

import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * @author sea36
 * @author dmj30
 */
public class DefaultResource extends ServerResource {

	@Get("ftl")
	public Representation getIndex() throws IOException {

		WebdemoApplication webDemo = (WebdemoApplication) getApplication();
	
		return webDemo.getTemplateRepresentation("index.ftl",
				new HashMap<String, String>(), MediaType.TEXT_HTML);

	}

}
