/*
 *	Copyright 2005-2006, Elver.org (http://www.eclipse.org/emf/teneo).
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

package org.eclipse.emf.teneo.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This exception is the base class of all exceptions which occur in the mapping process. This class offers automatic
 * logging to commons logging. Note that this class extends RuntimeException, so no forced throws and catch statements.
 * Although there are very differing views on this topic but it is our experience that to many checked exceptions only
 * distract the programmer and have no added value.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class StoreMappingException extends RuntimeException {
	/**
	 * Serial id
	 */
	private static final long serialVersionUID = 4685665979865102829L;

	/**
	 * The constructor, logs the exception also
	 */
	public StoreMappingException(String msg, Throwable cause) {
		super(msg, cause);

		// and log it, note the logger is recreated to automatically
		// log for subclasses.
		final Log log = LogFactory.getLog(this.getClass());
		log.error(msg, cause);
	}

	/**
	 * The constructor, logs the exception also
	 */
	public StoreMappingException(String msg) {
		super(msg);

		// and log it, note the logger is recreated to automatically
		// log for subclasses.
		final Log log = LogFactory.getLog(this.getClass());
		log.error(msg, this);
	}
}
