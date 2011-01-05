package uk.ac.cam.ch.wwmm.chemicaltagger.webdemo;

import java.io.IOException;
import java.io.InputStream;

import nu.xom.Document;

import org.apache.commons.io.IOUtils;
import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger;
import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistrySentenceParser;
import uk.ac.cam.ch.wwmm.chemicaltagger.POSContainer;

/**
 * @author sea36
 * @author dmj30
 */
public class SubmitResource extends ServerResource {

    @Post("form:txt")
    public Representation doForm(Form form) throws IOException {
        String body = form.getFirstValue("body");
        POSContainer container = ChemistryPOSTagger.getInstance().runTaggers(body);
        InputStream taggedStream = IOUtils.toInputStream(container.getTokenTagTupleAsString(), "UTF-8");
        ChemistrySentenceParser parser = new ChemistrySentenceParser(taggedStream);
        Document doc = parser.parseTagsToDocument();
        
        return new StringRepresentation(doc.toXML(), MediaType.APPLICATION_XML);
    }


}
