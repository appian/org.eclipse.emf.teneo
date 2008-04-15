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
package org.eclipse.emf.teneo.eclipselink;

import java.lang.reflect.Field;

import org.eclipse.persistence.exceptions.DescriptorException;
import org.eclipse.persistence.internal.helper.ConversionManager;
import org.eclipse.persistence.internal.helper.Helper;
import org.eclipse.persistence.internal.security.PrivilegedAccessHelper;

public class Utils {

  /**
   * Sets the value of the instance variable in the object to the value.
   * 
   * @param field
   *          TODO
   */
  public static void setAttributeValueInObject(Object anObject, Object value, Field field) throws DescriptorException {
    String fieldName = field.getName();
    try {
      // PERF: Direct variable access.
      PrivilegedAccessHelper.setValueInField(field, anObject, value);
    }
    catch (IllegalArgumentException exception) {
      throw DescriptorException.illegalArgumentWhileSettingValueThruInstanceVariableAccessor(fieldName, field.getType().getName(), value, exception);
    }
    catch (IllegalAccessException exception) {
      throw DescriptorException.illegalAccessWhileSettingValueThruInstanceVariableAccessor(fieldName, anObject.getClass().getName(), value, exception);
    }
    catch (NullPointerException exception) {
      try {
        if (anObject != null) {
          Class<?> fieldClass = field.getType();
          if (Helper.isPrimitiveWrapper(fieldClass) && value == null) {
            PrivilegedAccessHelper.setValueInField(field, anObject, ConversionManager.getDefaultManager().convertObject(new Integer(0), fieldClass));
          }
          else {
            throw DescriptorException.nullPointerWhileSettingValueThruInstanceVariableAccessor(fieldName, value, exception);
          }
        }
        else {
          // Some JVM's throw this exception for some very odd reason
          throw DescriptorException.nullPointerWhileSettingValueThruInstanceVariableAccessor(fieldName, value, exception);
        }
      }
      catch (IllegalAccessException accessException) {
        throw DescriptorException.nullPointerWhileSettingValueThruInstanceVariableAccessor(fieldName, value, exception);
      }
    }
  }

}
