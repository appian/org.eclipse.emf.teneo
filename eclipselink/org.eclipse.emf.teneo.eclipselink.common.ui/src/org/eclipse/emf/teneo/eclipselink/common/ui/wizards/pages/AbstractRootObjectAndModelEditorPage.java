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
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.teneo.eclipselink.common.ui.Activator;
import org.eclipse.emf.teneo.eclipselink.common.ui.internal.messages.Messages;
import org.eclipse.emf.teneo.eclipselink.common.ui.preferencepages.IDatabasePreferenceConstants;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public abstract class AbstractRootObjectAndModelEditorPage extends WizardPage {

	protected static QualifiedName rootObjectName = new QualifiedName(Activator.getDefault().getBundle()
			.getSymbolicName(), "rootObject"); //$NON-NLS-1$
	protected static QualifiedName editorIdName = new QualifiedName(Activator.getDefault().getBundle()
			.getSymbolicName(), "editorId"); //$NON-NLS-1$

	protected Combo rootObjectField;
	protected Combo editorIdField;

	protected AdapterFactoryItemDelegator adapterFactoryItemDelegator;
	protected List<EObject> rootObjectCandidates = new ArrayList<EObject>();

	public AbstractRootObjectAndModelEditorPage(String pageName) {
		super(pageName);
		AdapterFactory adapterFactory = new ReflectiveItemProviderAdapterFactory();
		adapterFactoryItemDelegator = new AdapterFactoryItemDelegator(adapterFactory);
	}

	public EObject getRootObject() {
		EObject result = null;
		for (EObject eObject : rootObjectCandidates) {
			String name = adapterFactoryItemDelegator.getText(eObject);
			if (name.equals(rootObjectField.getText())) {
				result = eObject;
			}
		}
		return result;
	}

	public String getEditorId() {
		return editorIdField.getText();
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		new Label(composite, SWT.LEFT).setText(Messages.label_rootObject);

		rootObjectField = new Combo(composite, SWT.BORDER);
		rootObjectField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		rootObjectField.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());

				EObject rootObject = getRootObject();
				if (rootObject != null) {
					URI uri = createDatabaseURI(getTypedPreviousPage().getPersistenceUnitName(), rootObject);
					setMessage(NLS.bind(Messages.message_loadsModelFromDatabaseUsingURI$0, uri));
				}
			}
		});

		new Label(composite, SWT.LEFT).setText(Messages.label_editorID);

		editorIdField = new Combo(composite, SWT.BORDER);
		editorIdField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		initEditorIdField();
		editorIdField.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		});

		setPageComplete(validatePage());
		setControl(composite);
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			updateRootObjectField();
		} else {
			persistWidgets();
		}
	}

	@Override
	public void dispose() {
		persistWidgets();
		super.dispose();
	}

	protected void initEditorIdField() {
		for (String editorId : getEditorIds()) {
			editorIdField.add(editorId);
		}
		int index = 0;
		try {
			String lastEditorId = ResourcesPlugin.getWorkspace().getRoot().getPersistentProperty(editorIdName);
			index = Arrays.asList(editorIdField.getItems()).indexOf(lastEditorId);
			index = index != -1 ? index : 0;
		} catch (CoreException cex) {
			Activator.getDefault().getLog().log(cex.getStatus());
		}
		editorIdField.select(index);
	}

	protected void updateRootObjectField() {
		rootObjectField.removeAll();

		rootObjectCandidates = loadRootObjectCandidates();
		for (EObject eObject : rootObjectCandidates) {
			String label = adapterFactoryItemDelegator.getText(eObject);
			rootObjectField.add(label);
		}
		int index = 0;
		try {
			String lastRootObject = ResourcesPlugin.getWorkspace().getRoot().getPersistentProperty(rootObjectName);
			index = Arrays.asList(rootObjectField.getItems()).indexOf(lastRootObject);
			index = index != -1 ? index : 0;
		} catch (CoreException cex) {
			Activator.getDefault().getLog().log(cex.getStatus());
		}
		rootObjectField.select(index);
	}

	protected boolean validatePage() {
		setErrorMessage(null);
		if (isBlank(rootObjectField.getText())) {
			setErrorMessage(Messages.error_rootObjectMissing);
			return false;
		}
		if (!Arrays.asList(rootObjectField.getItems()).contains(rootObjectField.getText())) {
			setErrorMessage(Messages.error_rootObjectMustBeExistingRootObjectCandidate);
			return false;
		}
		if (isBlank(editorIdField.getText())) {
			setErrorMessage(Messages.error_editorIDMissing);
			return false;
		}
		if (!Arrays.asList(editorIdField.getItems()).contains(editorIdField.getText())) {
			setErrorMessage(Messages.error_editorIDMustIdentifyExistingEditor);
			return false;
		}
		return true;
	}

	protected void persistWidgets() {
		try {
			ResourcesPlugin.getWorkspace().getRoot().setPersistentProperty(rootObjectName, rootObjectField.getText());
			ResourcesPlugin.getWorkspace().getRoot().setPersistentProperty(editorIdName, editorIdField.getText());
		} catch (CoreException cex) {
			Activator.getDefault().getLog().log(cex.getStatus());
		}
	}

	protected abstract URI createDatabaseURI(String persistenceUnitName, EClass eClass);

	protected abstract URI createDatabaseURI(String persistenceUnitName, EObject eObject);

	protected abstract Map<String, Object> getPersistenceUnitProperties();

	protected abstract Map<String, Object> getDatabaseLoginOptionsFromPreviousPage();

	protected boolean isBlank(String string) {
		return string == null || string.trim().length() == 0;
	}

	protected BasicModelAndDatabaseAccessParametersPage getTypedPreviousPage() {
		return (BasicModelAndDatabaseAccessParametersPage) getPreviousPage();
	}

	protected List<EObject> loadRootObjectCandidates() {
		List<EObject> result = new ArrayList<EObject>();
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(getTypedPreviousPage().getPackageNsURI());
		EClass eRootClass = (EClass) ePackage.getEClassifier(getTypedPreviousPage().getRootObjectTypeName());
		URI uri = createDatabaseURI(getTypedPreviousPage().getPersistenceUnitName(), eRootClass);

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().putAll(getPersistenceUnitProperties());
		if (IDatabasePreferenceConstants.USE_LOGIN_FROM_USER_PREFERENCES.equals(getTypedPreviousPage()
				.getUseLoginFrom())) {
			resourceSet.getLoadOptions().putAll(getDatabaseLoginOptionsFromPreviousPage());
		}
		Resource resource = null;
		try {
			resource = resourceSet.getResource(uri, true);
			EList<EObject> contents = resource.getContents();
			if (contents.size() > 0) {
				result.addAll(contents);
			} else {
				setErrorMessage(NLS.bind(Messages.error_databaseContainsNo$0Objects, eRootClass.getName()));
			}
		} catch (Exception exception) {
			setErrorMessage(Messages.error_failedToOpenDatabase);
			Activator.getDefault().getLog().log(
					new Status(IStatus.ERROR, Activator.PLUGIN_ID, exception.getMessage(), exception));
		} finally {
			if (resource != null) {
				resource.unload();
			}
		}

		return result;
	}

	protected List<String> getEditorIds() {
		List<String> result = new ArrayList<String>();
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = registry.getConfigurationElementsFor("org.eclipse.ui.editors"); //$NON-NLS-1$
		if (elements != null) {
			for (IConfigurationElement element : elements) {
				String extensions = element.getAttribute("extensions"); //$NON-NLS-1$
				if (extensions != null && extensions.indexOf("database") != -1) { //$NON-NLS-1$
					result.add(element.getAttribute("id")); //$NON-NLS-1$
				}
			}
		}
		return result;
	}
}
