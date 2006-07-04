/*
 *	Copyright 2004-2005, Elver.org (http://www.eclipse.org/emf/teneo).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */

package org.eclipse.emf.teneo.annotations.processing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;

/**
 * Thrown during processing and generation of mappings.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public class ProcessingException extends RuntimeException {

	/** Logger */
	private static final Log log = LogFactory.getLog(ProcessingException.class);

	/** Appends the toString of the paElement to the message */
	public ProcessingException(String msg, PAnnotatedEModelElement paElement) {
		super(msg + ", " + paElement);
		log.error("EXCEPTION: " + getMessage());
	}

	/** Constructor */
	public ProcessingException(String msg) {
		super(msg);
		log.error("EXCEPTION: " + getMessage());
	}

	/** Appends the toString of the paElement to the message */
	public ProcessingException(String msg, PAnnotation pAnnotation) {
		super(msg + ", " + pAnnotation);
		log.error("EXCEPTION: " + getMessage());
	}

}
