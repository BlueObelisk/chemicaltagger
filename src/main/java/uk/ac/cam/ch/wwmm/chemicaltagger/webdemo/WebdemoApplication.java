package uk.ac.cam.ch.wwmm.chemicaltagger.webdemo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Restlet;
import org.restlet.data.MediaType;
import org.restlet.data.Protocol;
import org.restlet.ext.freemarker.TemplateRepresentation;
import org.restlet.resource.Directory;
import org.restlet.routing.Router;

import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger;
import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistrySentenceParser;
import freemarker.template.Configuration;

/**
 * @author sea36
 * @author dmj30
 */
public class WebdemoApplication extends Application {

	private Configuration freemarker;

	public WebdemoApplication() throws IOException {
		freemarker = new Configuration();
		freemarker.setDirectoryForTemplateLoading(new File(
				"src/main/resources/webdemo/templates"));

	}

	@Override
	public Restlet createInboundRoot() {
		Router router = new Router(getContext());
		router.attach("/submit", SubmitResource.class);
		router.attach("/", DefaultResource.class);
		router.attach("/viewXML", ViewXML.class);
		getConnectorService().getClientProtocols().add(Protocol.FILE);
		;
		Directory dir = new Directory(getContext(), ClassLoader
				.getSystemResource("webdemo/resources").toString());
		router.attach("/res", dir);
		return router;
	}

	

    public TemplateRepresentation getTemplateRepresentation(String name, MediaType mediaType) throws IOException {
        Map<String,Object> model = new HashMap<String,Object>();
        return getTemplateRepresentation(name, model, mediaType);
    }

    public TemplateRepresentation getTemplateRepresentation(String name, Map<String, ?> model, MediaType mediaType) throws IOException {
        freemarker.template.Template template = freemarker.getTemplate(name);
        TemplateRepresentation rep = new TemplateRepresentation(template, model, mediaType);
        
        return rep;
    }

	public static void main(String[] args) throws Exception {

		Component c = new Component();
		c.getClients().add(Protocol.FILE);
		c.getServers().add(Protocol.HTTP, 8182);
		c.getClients().add(Protocol.CLAP);
		c.getDefaultHost().attachDefault(new WebdemoApplication());
		c.start();
		// automatically initialise...
		ChemistryPOSTagger.getInstance().runTaggers("");
		new ChemistrySentenceParser(IOUtils.toInputStream(""))
				.parseTagsToDocument();
	}

}
