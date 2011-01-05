package uk.ac.cam.ch.wwmm.chemicaltagger.webdemo;

import org.apache.commons.io.IOUtils;
import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Restlet;
import org.restlet.data.Protocol;
import org.restlet.routing.Router;

import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger;
import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistrySentenceParser;

/**
 * @author sea36
 * @author dmj30
 */
public class WebdemoApplication extends Application {

    @Override
    public Restlet createInboundRoot() {
        Router router = new Router();
        router.attach("/submit", SubmitResource.class);
        router.attach("/", DefaultResource.class);
        return router;
    }

    public static void main(String[] args) throws Exception {
        Component c = new Component();
        c.getClients().add(Protocol.FILE);
        c.getServers().add(Protocol.HTTP, 8182);
        c.getDefaultHost().attachDefault(new WebdemoApplication());
        c.start();
        //automatically initialise...
        ChemistryPOSTagger.getInstance().runTaggers("");
        new ChemistrySentenceParser(IOUtils.toInputStream("")).parseTagsToDocument();
    }
    
}
