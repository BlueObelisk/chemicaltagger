package uk.ac.cam.ch.wwmm.chemicaltagger.webdemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import nu.xom.Document;

import org.apache.commons.io.IOUtils;
import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import freemarker.template.utility.StringUtil;

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
        WebdemoApplication webDemo = (WebdemoApplication) getApplication();

        POSContainer container = ChemistryPOSTagger.getInstance().runTaggers(body);
        InputStream taggedStream = IOUtils.toInputStream(container.getTokenTagTupleAsString(), "UTF-8");
        ChemistrySentenceParser parser = new ChemistrySentenceParser(taggedStream);
        Document doc = parser.parseTagsToDocument();
        Map<String,Object> model = new HashMap<String, Object>();
        XMLtoHTML xmltoHTML = new XMLtoHTML();
        xmltoHTML.convert(doc);
        
        model.put("xmlContent",doc.toXML());
        model.put("taggedText",xmltoHTML.getTaggedText());
        model.put("checkBoxes", xmltoHTML.getCheckBoxes());
        
        return webDemo.getTemplateRepresentation("tagged.ftl", model, MediaType.TEXT_HTML);
        
    }


}
