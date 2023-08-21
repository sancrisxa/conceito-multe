package com.sancrisxa.conceitomulte.Service;

import com.sancrisxa.conceitomulte.Dto.LivroDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

@Service
@AllArgsConstructor
public class XmlServiceImpl implements XmlService {

    private static final String XML_FILENAME
            = "src/main/resources/LivroDto.xml";
    private static final String XSLT_FILENAME
            = "src/main/resources/LivroDto-html.xslt";

    @Override
    public void convertToXml(LivroDto livroDto) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(LivroDto.class);

            Marshaller marshaller = jaxbContext.createMarshaller();

            File file = new File("src/main/resources/LivroDto.xml");

            marshaller.marshal(livroDto, file);

            mXsltXmlToHtmlDomParserain();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mXsltXmlToHtmlDomParserain() {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try (InputStream is = new FileInputStream(XML_FILENAME)) {

            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(is);

            try (FileOutputStream output =
                         new FileOutputStream("src/main/resources/LivroDto-html.html")) {
                transform(doc, output);
            }

        } catch (IOException | ParserConfigurationException |
                 SAXException | TransformerException e) {
            e.printStackTrace();
        }

    }

    private static void transform(Document doc, OutputStream output)
            throws TransformerException {

        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        Transformer transformer = transformerFactory.newTransformer(
                new StreamSource(new File(XSLT_FILENAME)));

        transformer.transform(new DOMSource(doc), new StreamResult(output));

    }
}
