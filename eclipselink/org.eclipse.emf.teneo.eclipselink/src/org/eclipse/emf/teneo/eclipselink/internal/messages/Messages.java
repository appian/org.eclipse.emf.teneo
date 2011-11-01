/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.internal.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.emf.teneo.eclipselink.internal.messages.messages"; //$NON-NLS-1$
	public static String assert_cannotSaveUnloadedResource;
	public static String assert_classloaderMustHavePersistenceUnit$0OnClasspath;
	public static String assert_invalidObjectId;
	public static String assert_unableToCreateEntityManangerFactoryforPersistenceUnit$0;
	public static String assert_uriMustContainContentsQueryString;
	public static String assert_uriMustContainEclipseLinkScheme;
	public static String assert_uriMustContainPersistenceUnitSegment;
	public static String exception_cannotSetOwnerOnEList;
	public static String exception_collectionClassNotSupported$0;
	public static String exception_containsKeyNotImplemented;
	public static String exception_containsValueNotImplemented;
	public static String exception_errorAddingElementToEList;
	public static String exception_errorAddingEntryToEMap;
	public static String exception_errorBuildingEListImplementation;
	public static String exception_errorDeletingEMapEntries;
	public static String exception_errorGettingDelegateList;
	public static String exception_errorGettingEntryEClass;
	public static String exception_errorGettingFeatureID;
	public static String exception_errorGettingListOwner;
	public static String exception_errorInvokingCloneOnDelegate;
	public static String exception_errorRemovingElementFromEList;
	public static String exception_errorSettingEListContents$0;
	public static String exception_errorSettingEMapContents;
	public static String exception_errorSettingListOwner;
	public static String exception_getNotImplemented;
	public static String exception_indexOfKeyNotImplemented;
	public static String exception_keySetNotImplmplemented;
	public static String exception_mapNotImplemented;
	public static String exception_putAllNotImplemented;
	public static String exception_putNotImplemented;
	public static String exception_rehashNotImplemented;
	public static String exception_removeKeyNotImplemented;
	public static String exception_unableToFindDelegateEListFieldOnBasicEMap;
	public static String exception_unusableTemporaryPlaceholderClass;
	public static String exception_valuesNotImplemented;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
