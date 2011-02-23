package uk.ac.cam.ch.wwmm.chemicaltagger.webdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Restlet;
import org.restlet.data.MediaType;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;
import org.restlet.ext.freemarker.TemplateRepresentation;
import org.restlet.resource.Directory;
import org.restlet.routing.Router;

import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger;
import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistrySentenceParser;
import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * @author sea36
 * @author dmj30
 * @author lh359
 */
public class WebdemoApplication extends Application {

	private Configuration freemarker;
	private File resourceDir;
	
	public WebdemoApplication() throws IOException {
		freemarker = new Configuration();
		freemarker.setClassForTemplateLoading(getClass(), "/webdemo/templates");
		
		//bust out the resource files in case we are running from a jar
		File tempFile = File.createTempFile("foo", "");
		resourceDir = new File(tempFile.getParentFile(), "chemicalTaggerWebdemoResources");
		tempFile.delete();
		if (resourceDir.exists()) {
			FileUtils.forceDelete(resourceDir);
		}
		resourceDir.mkdirs();
		
		InputStream functionsIn = ClassLoader.getSystemResourceAsStream("webdemo/resources/functions.js");
		FileOutputStream functionsOut = new FileOutputStream(new File(resourceDir, "functions.js"));
		IOUtils.copy(functionsIn, functionsOut);
		
		InputStream jqueryIn = ClassLoader.getSystemResourceAsStream("webdemo/resources/jquery-latest.js");
		FileOutputStream jqueryOut = new FileOutputStream(new File(resourceDir, "jquery-latest.js"));
		IOUtils.copy(jqueryIn, jqueryOut);
		
		InputStream styleIn = ClassLoader.getSystemResourceAsStream("webdemo/resources/style-extract.css");
		FileOutputStream styleOut = new FileOutputStream(new File(resourceDir, "style-extract.css"));
		IOUtils.copy(styleIn, styleOut);
	}

	@Override
	public Restlet createInboundRoot() {
		Router router = new Router(getContext());
		router.attach("/submit", SubmitResource.class);
		router.attach("/", DefaultResource.class);
		router.attach("/viewXML", ViewXML.class);
		getConnectorService().getClientProtocols().add(Protocol.FILE);

		Directory dir = new Directory(getContext(), new Reference(resourceDir.toURI()));
		router.attach("/res", dir);
		return router;
	}

	

    public TemplateRepresentation getTemplateRepresentation(String name, MediaType mediaType) throws IOException {
        Map<String,Object> model = new HashMap<String,Object>();
        return getTemplateRepresentation(name, model, mediaType);
    }

    public TemplateRepresentation getTemplateRepresentation(String name, Map<String, ?> model, MediaType mediaType) throws IOException {
    	Template template = freemarker.getTemplate(name);
        return new TemplateRepresentation(template, model, mediaType);
    }

	public static void main(String[] args) throws Exception {

		Component c = new Component();
		c.getClients().add(Protocol.FILE);
		c.getServers().add(Protocol.HTTP, 8183);
		c.getClients().add(Protocol.CLAP);
		c.getDefaultHost().attachDefault(new WebdemoApplication());
		c.start();
		// automatically initialise...
		ChemistryPOSTagger.getInstance().runTaggers("");
		ChemistrySentenceParser chemParser = new ChemistrySentenceParser(IOUtils.toInputStream(""));
		chemParser.parseTags();
		chemParser.getDocument();
	}

}
