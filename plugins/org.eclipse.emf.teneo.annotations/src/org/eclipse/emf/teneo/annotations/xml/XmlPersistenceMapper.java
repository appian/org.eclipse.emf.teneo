package org.eclipse.emf.teneo.annotations.xml;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.xml.sax.SAXException;

/**
 * Populates and configures a PAnnotatedModel using an XML persistence mapping file.
 * 
 * @author <a href="lmfridael@elver.org">Laurens Fridael</a>
 * 
 */
public class XmlPersistenceMapper {
	private InputStream xmlMapping;

	/**
	 * Sets the InputStream containing the XML mapping.
	 * 
	 * @param xmlMapping
	 *            The InputStream containing the XML persistence mapping. Closed automatically by
	 *            {@link #applyPersistenceMapping(PAnnotatedModel)}.
	 */
	public void setXmlMapping(InputStream xmlMapping) {
		if (xmlMapping == null) {
			throw new IllegalArgumentException("XML mapping cannot be null.");
		}
		this.xmlMapping = xmlMapping;
	}

	/**
	 * Applies the XML persistence mapping to a PAnnotatedModel.
	 * 
	 * @throws IllegalStateException
	 *             if the XML mapping was not configured.
	 * @throws RuntimeException
	 *             If there was an error reading or parsing the XML file.
	 */
	public void applyPersistenceMapping(PAnnotatedModel pAnnotatedModel) {
		if (xmlMapping == null) {
			throw new IllegalStateException("XML mapping not configured.");
		}

		final SAXParser saxParser;
		try {
			final SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
			saxParserFactory.setNamespaceAware(true);
			saxParserFactory.setValidating(true);
			saxParser = saxParserFactory.newSAXParser();
		} catch (ParserConfigurationException e) {
			throw new AssertionError(e);
		} catch (SAXException e) {
			throw new AssertionError(e);
		}

		try {
			saxParser.setProperty("http://java.sun.com/xml/jaxp/properties/schemaLanguage",
					"http://www.w3.org/2001/XMLSchema");
			saxParser.setProperty("http://java.sun.com/xml/jaxp/properties/schemaSource", this.getClass()
					.getResourceAsStream("persistence-mapping.xsd"));
			saxParser.parse(xmlMapping, new XmlPersistenceContentHandler(pAnnotatedModel));
		} catch (SAXException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				xmlMapping.close();
			} catch (IOException e) {
			}
		}
	}

}
