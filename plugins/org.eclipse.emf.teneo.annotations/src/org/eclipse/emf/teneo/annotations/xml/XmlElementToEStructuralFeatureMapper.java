package org.eclipse.emf.teneo.annotations.xml;

import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Helper class used internally for mapping XML element names to EStructuralFeature names.
 * 
 * @author <a href="lmfridael@elver.org">Laurens Fridael</a>
 * 
 */
class XmlElementToEStructuralFeatureMapper {
	/**
	 * Singleton instance.
	 */
	public static XmlElementToEStructuralFeatureMapper INSTANCE = new XmlElementToEStructuralFeatureMapper();

	private Map eStructuralFeatureNamesByXmlElementName = new HashMap();

	private String xmlElementName;

	private boolean appInfoValue;

	private XmlElementToEStructuralFeatureMapper() {
		try {
			final SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
			saxParserFactory.setNamespaceAware(true);
			final SAXParser saxParser = saxParserFactory.newSAXParser();
			saxParser.parse(this.getClass().getResourceAsStream("persistence-mapping.xsd"), new XmlContentHandler());
		} catch (Exception e) {
			throw new AssertionError(e);
		}
	}

	private class XmlContentHandler extends DefaultHandler {

		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			if (localName.equals("attribute") || localName.equals("element")) {
				xmlElementName = attributes.getValue("name");
			} else if (localName.equals("appinfo")
					&& "http://annotation.elver.org/internal/EStructuralFeatureName".equals(attributes
							.getValue("source"))) {
				appInfoValue = true;
			}
		}

		public void characters(char[] ch, int start, int length) throws SAXException {
			if (appInfoValue && xmlElementName != null) {
				final String eStructuralFeatureName = new String(ch, start, length).trim();
				if (eStructuralFeatureName.length() > 0
						&& !eStructuralFeatureNamesByXmlElementName.containsKey(xmlElementName)) {
					eStructuralFeatureNamesByXmlElementName.put(xmlElementName, eStructuralFeatureName);
					appInfoValue = false;
					xmlElementName = null;
				}
			}
		}
	}

	public String getEStructuralFeatureName(String xmlElementName) {
		return (String) eStructuralFeatureNamesByXmlElementName.get(xmlElementName);
	}
}
