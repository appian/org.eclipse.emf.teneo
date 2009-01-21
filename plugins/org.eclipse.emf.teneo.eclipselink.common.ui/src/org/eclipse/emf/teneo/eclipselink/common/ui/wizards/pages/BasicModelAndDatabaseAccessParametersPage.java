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
package org.eclipse.emf.teneo.eclipselink.common.ui.wizards.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.eclipselink.common.ui.Activator;
import org.eclipse.emf.teneo.eclipselink.common.ui.preferencepages.IDatabasePreferenceConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class BasicModelAndDatabaseAccessParametersPage extends WizardPage {

	protected static QualifiedName packageNsURIName = new QualifiedName(Activator.getDefault().getBundle()
			.getSymbolicName(), "packageNsURI");
	protected static QualifiedName rootObjectTypeName = new QualifiedName(Activator.getDefault().getBundle()
			.getSymbolicName(), "rootObjectType");
	protected static QualifiedName persistenceUnitNameName = new QualifiedName(Activator.getDefault().getBundle()
			.getSymbolicName(), "persistenceUnitName");

	protected Combo packageNsURIField;
	protected Combo rootObjectTypeField;
	protected Combo persistenceUnitNameField;

	protected Button useLoginFromPersistenceUnitButton;
	protected Button useLoginFromUserPreferencesButton;
	private Label databaseURLLabel;
	protected Combo databaseURLField;
	private Label jdbcDriverLabel;
	protected Combo jdbcDriverField;
	private Label userNameLabel;
	protected Text userNameField;
	private Label passwordLabel;
	protected Text passwordField;

	public BasicModelAndDatabaseAccessParametersPage(String pageName) {
		super(pageName);
	}

	public String getPackageNsURI() {
		return packageNsURIField.getText();
	}

	public String getRootObjectTypeName() {
		return rootObjectTypeField.getText();
	}

	public String getPersistenceUnitName() {
		return persistenceUnitNameField.getText();
	}

	public String getUseLoginFrom() {
		String result;
		if (useLoginFromUserPreferencesButton.getSelection()) {
			result = IDatabasePreferenceConstants.USE_LOGIN_FROM_USER_PREFERENCES;
		} else {
			result = IDatabasePreferenceConstants.USE_LOGIN_FROM_PERSISTENCE_UNIT;
		}
		return result;
	}

	public String getDatabaseURL() {
		return databaseURLField.getText();
	}

	public String getJDBCDriver() {
		return jdbcDriverField.getText();
	}

	public String getUserName() {
		return userNameField.getText();
	}

	public String getPassword() {
		return passwordField.getText();
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		createModelAndPersistenceUnitGroup(composite);
		createDatabaseLoginGroup(composite);

		setPageComplete(validatePage());
		setControl(composite);
	}

	private void createModelAndPersistenceUnitGroup(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// create Ecore package namespace URI selection widgets
		new Label(composite, SWT.LEFT).setText("Package namespace URI:");

		packageNsURIField = new Combo(composite, SWT.BORDER);
		packageNsURIField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		initPackageNsURIField();
		packageNsURIField.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				updateRootObjectTypeField();
				setPageComplete(validatePage());
			}
		});

		// create root object type selection widgets
		new Label(composite, SWT.LEFT).setText("Root object type:");

		rootObjectTypeField = new Combo(composite, SWT.BORDER);
		rootObjectTypeField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		rootObjectTypeField.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		});

		// create persistence unit name selection widgets
		new Label(composite, SWT.LEFT).setText("Persistence Unit name:");

		persistenceUnitNameField = new Combo(composite, SWT.BORDER);
		persistenceUnitNameField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		initPersistenceUnitNameField();
		persistenceUnitNameField.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		});

		updateRootObjectTypeField();
	}

	private void createDatabaseLoginGroup(Composite parent) {
		Group group = new Group(parent, SWT.NONE);
		group.setText("Database login:");
		group.setLayout(new GridLayout(2, false));
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// create use login from selection widgets
		useLoginFromPersistenceUnitButton = new Button(group, SWT.RADIO);
		useLoginFromPersistenceUnitButton.setText("from Persistence Unit");
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = 2;
		useLoginFromPersistenceUnitButton.setLayoutData(gridData);
		useLoginFromUserPreferencesButton = new Button(group, SWT.RADIO);
		useLoginFromUserPreferencesButton.setText("from user preferences");
		gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = 2;
		useLoginFromUserPreferencesButton.setLayoutData(gridData);
		initUseLoginFromButtons();
		useLoginFromUserPreferencesButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				updateDatabaseLoginFields();
				setPageComplete(validatePage());
			}
		});

		// create database URL selection widgets
		databaseURLLabel = new Label(group, SWT.LEFT);
		databaseURLLabel.setText("Database URL:");

		databaseURLField = new Combo(group, SWT.BORDER);
		databaseURLField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		initDatabaseURLField();
		databaseURLField.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		});

		// create JDBC driver selection widgets
		jdbcDriverLabel = new Label(group, SWT.LEFT);
		jdbcDriverLabel.setText("JDBC driver:");

		jdbcDriverField = new Combo(group, SWT.BORDER);
		jdbcDriverField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		initJDBCDriverField();
		jdbcDriverField.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		});

		// create user name widgets
		userNameLabel = new Label(group, SWT.LEFT);
		userNameLabel.setText("User name:");

		userNameField = new Text(group, SWT.BORDER);
		userNameField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		userNameField.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		});

		// create password name widgets
		passwordLabel = new Label(group, SWT.LEFT);
		passwordLabel.setText("Password:");

		passwordField = new Text(group, SWT.BORDER);
		passwordField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		passwordField.setEchoChar('*');
		passwordField.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		});

		updateDatabaseLoginFields();
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (!visible) {
			persistWidgets();
		}
	}

	protected void initPackageNsURIField() {
		for (String nsURI : getModelNsURIs()) {
			packageNsURIField.add(nsURI);
		}
		int index = 0;
		try {
			String lastPackageNsURI = ResourcesPlugin.getWorkspace().getRoot().getPersistentProperty(packageNsURIName);
			index = Arrays.asList(packageNsURIField.getItems()).indexOf(lastPackageNsURI);
			index = index != -1 ? index : 0;
		} catch (CoreException cex) {
			Activator.getDefault().getLog().log(cex.getStatus());
		}
		packageNsURIField.select(index);
	}

	protected void initPersistenceUnitNameField() {
		for (String name : getPersistenceUnitNames()) {
			persistenceUnitNameField.add(name);
		}
		int index = 0;
		try {
			String lastPersistenceUnitName = ResourcesPlugin.getWorkspace().getRoot().getPersistentProperty(
					persistenceUnitNameName);
			index = Arrays.asList(persistenceUnitNameField.getItems()).indexOf(lastPersistenceUnitName);
			index = index != -1 ? index : 0;
		} catch (CoreException cex) {
			Activator.getDefault().getLog().log(cex.getStatus());
		}
		persistenceUnitNameField.select(index);
	}

	protected void initUseLoginFromButtons() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String useLoginFrom = store.getString(IDatabasePreferenceConstants.USE_LOGIN_FROM);
		useLoginFromPersistenceUnitButton.setSelection(IDatabasePreferenceConstants.USE_LOGIN_FROM_PERSISTENCE_UNIT
				.equals(useLoginFrom));
		useLoginFromUserPreferencesButton.setSelection(IDatabasePreferenceConstants.USE_LOGIN_FROM_USER_PREFERENCES
				.equals(useLoginFrom));
	}

	protected void initDatabaseURLField() {
		databaseURLField.add("jdbc:derby://localhost:1527/sample;create=true");
		databaseURLField.add("jdbc:oracle:thin:@localhost:1521:XE");
		databaseURLField.add("jdbc:oracle:thin:@localhost:1521:ORCL");
	}

	protected void initJDBCDriverField() {
		jdbcDriverField.add("org.apache.derby.jdbc.ClientDriver");
		jdbcDriverField.add("oracle.jdbc.OracleDriver");
		jdbcDriverField.add("com.mysql.jdbc.Driver");
	}

	protected void updateRootObjectTypeField() {
		rootObjectTypeField.removeAll();

		for (String name : getModelObjectTypeNames(packageNsURIField.getText())) {
			rootObjectTypeField.add(name);
		}
		int index = 0;
		try {
			String lastRootObjectType = ResourcesPlugin.getWorkspace().getRoot().getPersistentProperty(
					rootObjectTypeName);
			index = Arrays.asList(rootObjectTypeField.getItems()).indexOf(lastRootObjectType);
			index = index != -1 ? index : 0;
		} catch (CoreException cex) {
			Activator.getDefault().getLog().log(cex.getStatus());
		}
		rootObjectTypeField.select(index);
	}

	protected void updateDatabaseLoginFields() {

		if (useLoginFromUserPreferencesButton.getSelection()) {
			IPreferenceStore store = Activator.getDefault().getPreferenceStore();
			databaseURLField.setText(store.getString(IDatabasePreferenceConstants.DATABASE_URL));
			jdbcDriverField.setText(store.getString(IDatabasePreferenceConstants.JDBC_DRIVER));
			userNameField.setText(store.getString(IDatabasePreferenceConstants.USER_NAME));
			passwordField.setText(store.getString(IDatabasePreferenceConstants.PASSWORD));

			databaseURLLabel.setEnabled(true);
			databaseURLField.setEnabled(true);
			jdbcDriverLabel.setEnabled(true);
			jdbcDriverField.setEnabled(true);
			userNameLabel.setEnabled(true);
			userNameField.setEnabled(true);
			passwordLabel.setEnabled(true);
			passwordField.setEnabled(true);
		} else {
			updateDatabaseLoginFieldsFromPersistenceUnit();

			databaseURLLabel.setEnabled(false);
			databaseURLField.setEnabled(false);
			jdbcDriverLabel.setEnabled(false);
			jdbcDriverField.setEnabled(false);
			userNameLabel.setEnabled(false);
			userNameField.setEnabled(false);
			passwordLabel.setEnabled(false);
			passwordField.setEnabled(false);
		}
	}

	protected boolean validatePage() {
		setErrorMessage(null);
		if (isBlank(packageNsURIField.getText())) {
			setErrorMessage("Package namespace URI must be specified.");
			return false;
		}
		if (!Arrays.asList(packageNsURIField.getItems()).contains(packageNsURIField.getText())) {
			setErrorMessage("Package namespace URI must identify existing Ecore package registred in global Ecore package registry.");
			return false;
		}
		if (isBlank(rootObjectTypeField.getText())) {
			setErrorMessage("Root object type must be specified.");
			return false;
		}
		if (!Arrays.asList(rootObjectTypeField.getItems()).contains(rootObjectTypeField.getText())) {
			setErrorMessage("Root object type must be member of Ecore package '" + packageNsURIField.getText() + "'.");
			return false;
		}
		if (isBlank(persistenceUnitNameField.getText())) {
			setErrorMessage("Persistence Unit name must be specified.");
			return false;
		}
		if (!Arrays.asList(persistenceUnitNameField.getItems()).contains(persistenceUnitNameField.getText())) {
			setErrorMessage("Persistence Unit name must identify existing Persistence Unit.");
			return false;
		}
		if (useLoginFromUserPreferencesButton != null && useLoginFromUserPreferencesButton.getSelection()) {
			if (isBlank(databaseURLField.getText())) {
				setErrorMessage("Database URL name must be specified.");
				return false;
			}
			if (isBlank(jdbcDriverField.getText())) {
				setErrorMessage("JDBC driver must be specified.");
				return false;
			}
			if (isBlank(userNameField.getText())) {
				setErrorMessage("User name must be specified.");
				return false;
			}
			if (isBlank(passwordField.getText())) {
				setErrorMessage("Password must be specified.");
				return false;
			}
		}
		return true;
	}

	protected void persistWidgets() {
		try {
			ResourcesPlugin.getWorkspace().getRoot().setPersistentProperty(packageNsURIName,
					packageNsURIField.getText());
			ResourcesPlugin.getWorkspace().getRoot().setPersistentProperty(rootObjectTypeName,
					rootObjectTypeField.getText());
			ResourcesPlugin.getWorkspace().getRoot().setPersistentProperty(persistenceUnitNameName,
					persistenceUnitNameField.getText());
		} catch (CoreException cex) {
			Activator.getDefault().getLog().log(cex.getStatus());
		}
	}

	protected Set<String> getPersistenceUnitNames() {
		return Collections.emptySet();
	}

	protected void updateDatabaseLoginFieldsFromPersistenceUnit() {
		databaseURLField.setText("");
		jdbcDriverField.setText("");
		userNameField.setText("");
		passwordField.setText("");
	}

	protected boolean isBlank(String string) {
		return string == null || string.trim().length() == 0;
	}

	protected List<String> getModelNsURIs() {
		List<String> result = new ArrayList<String>(EPackage.Registry.INSTANCE.keySet());
		Collections.sort(result, java.text.Collator.getInstance());
		return result;
	}

	protected List<String> getModelObjectTypeNames(String nsURI) {
		List<String> result = new ArrayList<String>();
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
		if (ePackage != null) {
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (!eClass.isAbstract()) {
						result.add(eClass.getName());
					}
				}
			}
		}
		Collections.sort(result, java.text.Collator.getInstance());
		return result;
	}
}
