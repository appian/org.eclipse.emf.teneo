package org.eclipse.emf.teneo.eclipselink.common.ui.internal.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.emf.teneo.eclipselink.common.ui.internal.messages.messages"; //$NON-NLS-1$
	public static String button_fromPersistenceUnit;
	public static String button_fromUserPreferences;
	public static String error_databaseContainsNo$0Objects;
	public static String error_databaseURLMissing;
	public static String error_editorIDMissing;
	public static String error_editorIDMustIdentifyExistingEditor;
	public static String error_failedToOpenDatabase;
	public static String error_jdbcDriverMissing;
	public static String error_packageNamespaceURIMissing;
	public static String error_packageNamespaceURIMustIdentifyExistingEcorePackage;
	public static String error_passwordMissing;
	public static String error_persistenceUnitNameMissing;
	public static String error_persistenceUnitNameMustIdentifyExistingPersistenceUnit;
	public static String error_rootObjectMissing;
	public static String error_rootObjectMustBeExistingRootObjectCandidate;
	public static String error_rootObjectMustBeInEcorePackage$0;
	public static String error_rootObjectTypeMissing;
	public static String error_userNameMissing;
	public static String group_databaseLogin;
	public static String label_DatabaseURL;
	public static String label_editorID;
	public static String label_jdbcDriver;
	public static String label_packageNamespaceURI;
	public static String label_password;
	public static String label_persistenceUnitName;
	public static String label_rootObject;
	public static String label_rootObjectType;
	public static String label_userName;
	public static String message_loadsModelFromDatabaseUsingURI$0;
	public static String page_emfModelAndDatabase_description;
	public static String page_emfModelAndDatabase_title;
	public static String page_rootObjectAndEMFModelEditor_description;
	public static String page_rootObjectAndEMFModelEditor_title;
	public static String value_databaseLogin;
	public static String value_databaseURL;
	public static String value_fromPersistenceUnit;
	public static String value_fromUserPreferences;
	public static String value_jdbcDriver;
	public static String value_password;
	public static String value_userName;
	public static String wizard_loadEMFModelFromDatabase_title;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
