/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Laurens Fridael
 *   Martin Taal
 * </copyright>
 *
 * $Id: XmlPersistenceMapper.java,v 1.1 2007/06/29 07:31:47 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.xml;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;

/**
 * Populates and configures a PAnnotatedModel using an XML persistence mapping file.
 * 
 * @author <a href="lmfridael@elver.org">Laurens Fridael</a>
 */
public class XmlPersistenceMapper {
	
	/** The inputStream containing the xml document */
	private InputStream xmlMapping;
	
	/** The logger */
	protected static final Log log = LogFactory.getLog(XmlPersistenceMapper.class);

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

		SAXParser saxParser;
		try {
			final SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
			saxParserFactory.setNamespaceAware(true);
			saxParserFactory.setValidating(true);
			
			saxParser = saxParserFactory.newSAXParser();
		} catch (ParserConfigurationException e) {
			throw new ParseXMLAnnotationsException(e);
		} catch (SAXException e) {
			throw new ParseXMLAnnotationsException(e);
		}

		try {
			try {
				saxParser.setProperty("http://java.sun.com/xml/jaxp/properties/schemaLanguage",
						"http://www.w3.org/2001/XMLSchema");
				saxParser.setProperty("http://java.sun.com/xml/jaxp/properties/schemaSource", this.getClass()
						.getResourceAsStream("persistence-mapping.xsd"));
			} catch (SAXNotRecognizedException s) {
				log.warn("Properties schemaSource and/or schemaLanguage are not supported, setvalidating=false. " +
						"Probably running 1.4 with an old crimson sax parser. Ignoring this and continuing with " +
						"a non-validating and name-space-aware sax parser");
				final SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
				saxParserFactory.setNamespaceAware(true);
				saxParserFactory.setValidating(false);
				saxParser = saxParserFactory.newSAXParser();
			}
			saxParser.parse(xmlMapping, new XmlPersistenceContentHandler(pAnnotatedModel, getPrefix(), 
					 this.getClass().getResourceAsStream("persistence-mapping.xsd")));
		} catch (SAXException e) {
			throw new ParseXMLAnnotationsException(e);
		} catch (IOException e) {
			throw new ParseXMLAnnotationsException(e);
		} catch (ParserConfigurationException e) {
			throw new ParseXMLAnnotationsException(e);
		} finally {
			try {
				xmlMapping.close();
			} catch (IOException e) {
				// ignoring io exception
			}
		}
	}

	/** Return a prefix which are used by a subpackage to make efeatures unique */
	protected String getPrefix() {
		return "";
	}	
}
