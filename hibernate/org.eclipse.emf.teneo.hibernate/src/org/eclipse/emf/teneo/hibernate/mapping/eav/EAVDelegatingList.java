/**
 * Copyright (c) 2009 Martin Taal and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Martin Taal - initial api
 */
package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.util.List;

/**
 * Tags EAV list and featuremap.
 */
public interface EAVDelegatingList {
	boolean isDelegateInitialized();
	
	void setPersistentList(List<?> persistentList);
}
