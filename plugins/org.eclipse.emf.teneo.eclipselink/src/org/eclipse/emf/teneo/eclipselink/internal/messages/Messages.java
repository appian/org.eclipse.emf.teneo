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
	public static String EclipseLinkEList_unusableTemporaryPlaceholderClass;
	public static String EclipseLinkEMap_containsKeyNotImplemented;
	public static String EclipseLinkEMap_containsValueNotImplemented;
	public static String EclipseLinkEMap_getNotImplemented;
	public static String EclipseLinkEMap_indexOfKeyNotImplemented;
	public static String EclipseLinkEMap_keySetNotImplmplemented;
	public static String EclipseLinkEMap_mapNotImplemented;
	public static String EclipseLinkEMap_putAllNotImplemented;
	public static String EclipseLinkEMap_putNotImplemented;
	public static String EclipseLinkEMap_removeKeyNotImplemented;
	public static String EclipseLinkEMap_valuesNotImplemented;
	public static String EclipseLinkResourceImpl_cannotSaveUnloadedResource;
	public static String EclipseLinkResourceImpl_classloaderMustHavePersistenceUnit$0OnClasspath;
	public static String EclipseLinkResourceImpl_invalidObjectId;
	public static String EclipseLinkResourceImpl_unableToCreateEntityManangerFactoryforPersistenceUnit$0;
	public static String EclipseLinkResourceImpl_uriMustContainContentsQueryString;
	public static String EclipseLinkResourceImpl_uriMustContainEclipseLinkScheme;
	public static String EclipseLinkResourceImpl_uriMustContainPersistenceUnitSegment;
	public static String EmfCollectionAdjuster_errorBuildingEListImplementation;
	public static String EmfHelper_cannotSetOwnerOnEList;
	public static String EmfHelper_collectionClassNotSupported$0;
	public static String EmfHelper_errorAddingElementToEList;
	public static String EmfHelper_errorAddingEntryToEMap;
	public static String EmfHelper_errorGettingDelegateList;
	public static String EmfHelper_errorGettingEntryEClass;
	public static String EmfHelper_errorGettingFeatureID;
	public static String EmfHelper_errorGettingListOwner;
	public static String EmfHelper_errorRemovingElementFromEList;
	public static String EmfHelper_errorSettingEListContents$0;
	public static String EmfHelper_errorSettingEMapContents;
	public static String EmfHelper_errorSettingListOwner;
	public static String EmfHelper_unableToFindDelegateEListFieldOnBasicEMap;
	public static String EmfQueryBasedValueHolder_errorBuildingEListImplementation;
	public static String EmfSessionEventListener_errorDeletingEMapEntries;
	public static String EmfUnitOfWorkQueryBasedValueHolder_errorBuildingEListImplementation;
	public static String IndirectEList_errorInvokingCloneOnDelegate;
	public static String IndirectEMap_errorInvokingCloneOnDelegate;
	public static String IndirectEMap_rehashNotImplemented;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
