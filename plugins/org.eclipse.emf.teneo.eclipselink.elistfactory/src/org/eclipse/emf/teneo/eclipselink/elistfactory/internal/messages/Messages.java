package org.eclipse.emf.teneo.eclipselink.elistfactory.internal.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.emf.teneo.eclipselink.elistfactory.messages"; //$NON-NLS-1$
	public static String assert_couldNotFindEClassifier$0InEPackage$1;
	public static String assert_couldNotFindEPackageForNamespaceURI$0;
	public static String assert_couldNotFindEPackageInterfaceOfEPackageClass$0;
	public static String assert_couldNotFindFeature$0InEClass$1;
	public static String assert_featureMustBeNonVolatileFeatureMapEntryType;
	public static String assert_featureMustBeNonVolatileListItemType;
	public static String assert_featureMustBeNonVolatileMapEntryType;
	public static String assert_typeOfEClassifier$0InEPackage$1IsNotEClass;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
