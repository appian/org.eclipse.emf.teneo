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
package org.eclipse.emf.teneo.eclipselink.common.ui.preferencepages;


import org.eclipse.emf.teneo.eclipselink.common.ui.Activator;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class BasicDatabasePreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

  protected RadioGroupFieldEditor useLoginFromEditor;
  protected Composite useLoginFromEditorComposite;

  protected StringFieldEditor databaseURLEditor;
  protected StringFieldEditor jdbcDriverEditor;
  protected StringFieldEditor userNameEditor;
  protected StringFieldEditor passwordEditor;
 
  public BasicDatabasePreferencePage() {
    super("", GRID);
  }

  public BasicDatabasePreferencePage(String title) {
    super(title, GRID);
  }

  public BasicDatabasePreferencePage(String title, ImageDescriptor image) {
    super(title, image, GRID);
  }

  //
  // IWorkbenchPreferencePage implementation
  //

  public void init(IWorkbench workbench) {

  }

  //
  // overrides
  //

  @Override
  protected void createFieldEditors() {
    // create use login from selection widgets
    useLoginFromEditor = new RadioGroupFieldEditor(
        IDatabasePreferenceConstants.USE_LOGIN_FROM, 
        "Database login:", 
        1, 
        new String[][] { 
            { "from Persistence Unit", IDatabasePreferenceConstants.USE_LOGIN_FROM_PERSISTENCE_UNIT }, 
            { "from user preferences", IDatabasePreferenceConstants.USE_LOGIN_FROM_USER_PREFERENCES } }, 
        getFieldEditorParent(), 
        true);
    addField(useLoginFromEditor);
    useLoginFromEditorComposite = useLoginFromEditor.getRadioBoxControl(getFieldEditorParent());

    // create database URL selection widgets
    databaseURLEditor = new StringFieldEditor(
        IDatabasePreferenceConstants.DATABASE_URL, 
        "Database URL:", 
        useLoginFromEditorComposite);
    databaseURLEditor.setEnabled(false, useLoginFromEditorComposite);
    addField(databaseURLEditor);

    // create JDBC driver selection widgets
    jdbcDriverEditor = new StringFieldEditor(
        IDatabasePreferenceConstants.JDBC_DRIVER, 
        "JDBC driver:", 
        useLoginFromEditorComposite);
    addField(jdbcDriverEditor);

    // create user name widgets
    userNameEditor = new StringFieldEditor(
        IDatabasePreferenceConstants.USER_NAME, 
        "User name:", 
        useLoginFromEditorComposite);
    addField(userNameEditor);

    // create password name widgets
    passwordEditor = new StringFieldEditor(
        IDatabasePreferenceConstants.PASSWORD, 
        "Password:", 
        useLoginFromEditorComposite);
    Text passwordField = passwordEditor.getTextControl(useLoginFromEditorComposite);
    passwordField.setEchoChar('*');
    addField(passwordEditor);

    // adjust layout of use login from selection widgets
    GridLayout layout = (GridLayout) useLoginFromEditorComposite.getLayout();
    layout.marginWidth = 5;
    layout.marginHeight = 5;

    // set the field editors's enabled state
    IPreferenceStore store = getPreferenceStore();
    setFieldEditorsEnabled(store.getString(IDatabasePreferenceConstants.USE_LOGIN_FROM));
  }

  @Override
  protected IPreferenceStore doGetPreferenceStore() {
    return Activator.getDefault().getPreferenceStore();
  }

  @Override
  public void propertyChange(PropertyChangeEvent event) {
    super.propertyChange(event);
    // event originating from use login from selection widgets?
    if (event.getSource() == useLoginFromEditor) {
      // set the field editors's enabled state
      setFieldEditorsEnabled((String) event.getNewValue());
    }
  }

  //
  // helper methods
  //

  protected void setFieldEditorsEnabled(String useLoginFromValue) {
    if (IDatabasePreferenceConstants.USE_LOGIN_FROM_USER_PREFERENCES.equals(useLoginFromValue)) {
      IPreferenceStore store = Activator.getDefault().getPreferenceStore();
      databaseURLEditor.setStringValue(store.getString(IDatabasePreferenceConstants.DATABASE_URL));
      jdbcDriverEditor.setStringValue(store.getString(IDatabasePreferenceConstants.JDBC_DRIVER));
      userNameEditor.setStringValue(store.getString(IDatabasePreferenceConstants.USER_NAME));
      passwordEditor.setStringValue(store.getString(IDatabasePreferenceConstants.PASSWORD));
      
      databaseURLEditor.setEnabled(true, useLoginFromEditorComposite);
      jdbcDriverEditor.setEnabled(true, useLoginFromEditorComposite);
      userNameEditor.setEnabled(true, useLoginFromEditorComposite);
      passwordEditor.setEnabled(true, useLoginFromEditorComposite);
    }
    else {
      databaseURLEditor.setStringValue(null);
      jdbcDriverEditor.setStringValue(null);
      userNameEditor.setStringValue(null);
      passwordEditor.setStringValue(null);
      
      databaseURLEditor.setEnabled(false, useLoginFromEditorComposite);
      jdbcDriverEditor.setEnabled(false, useLoginFromEditorComposite);
      userNameEditor.setEnabled(false, useLoginFromEditorComposite);
      passwordEditor.setEnabled(false, useLoginFromEditorComposite);
    }
  }
}
