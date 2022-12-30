package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class AnimalSaveXML {
    public static void DOMsaveXML() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            // add root element animal
            Element rootElement = doc.createElement("animal");
            doc.appendChild(rootElement);
            // add child element cat
            Element cat1 = doc.createElement("cat");
            rootElement.appendChild(cat1);
            // add child element name
            Element name1 = doc.createElement("name");
            name1.setTextContent("Marsel");
            cat1.appendChild(name1);
            // add child element age
            Element age1 = doc.createElement("age");
            age1.setTextContent("7");
            cat1.appendChild(age1);
            // add child element breed
            Element breed1 = doc.createElement("breed");
            breed1.setTextContent("Sphynx");
            cat1.appendChild(breed1);
            // add child element weight
            Element weight1 = doc.createElement("weight");
            weight1.setTextContent("6");
            cat1.appendChild(weight1);

            // add next child element cat
            Element cat2 = doc.createElement("cat");
            rootElement.appendChild(cat2);
            // add child element name
            Element name2 = doc.createElement("name");
            name2.setTextContent("Myrzik");
            cat2.appendChild(name2);
            // add child element age
            Element age2 = doc.createElement("age");
            age2.setTextContent("5");
            cat2.appendChild(age2);
            // add child element breed
            Element breed2 = doc.createElement("breed");
            breed2.setTextContent("Oriental");
            cat2.appendChild(breed2);
            // add child element weight
            Element weight2 = doc.createElement("weight");
            weight2.setTextContent("4");
            cat2.appendChild(weight2);
            // save xml file
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult sr = new StreamResult(new File("src/xml/animal.xml"));
            t.transform(source, sr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
