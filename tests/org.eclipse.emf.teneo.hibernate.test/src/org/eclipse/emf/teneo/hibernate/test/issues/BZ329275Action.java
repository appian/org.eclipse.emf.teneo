/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Factory;
import org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package;
import org.eclipse.emf.teneo.samples.issues.bz329275.Item;
import org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class BZ329275Action extends AbstractTestAction {

	private static String STR_VALUE = "test";
	private static Long LNG_OBJ_VALUE = new Long(15);
	private static TestEnum ENUM_VALUE = TestEnum.LITERAL2;
	private static long LNG_VALUE = -2;

	public BZ329275Action() {
		super(new EPackage[] { Bz329275Package.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			Item item1 = Bz329275Factory.eINSTANCE.createItem();

			// cases to test
			// unsettable string no default
			// unsettable string with default
			// standard string no default
			// standard string with default
			// unsettable enum
			// standard enum
			// unsettable primitve no default
			// unsettable primitve with default
			// standard primitve no default
			// standard primitve with default
			// unsettable object primitve no default
			// unsettable object primitve with default
			// standard object primitve no default
			// standard object primitve with default
			item1.setStandardEnum(null);
			item1.setStandardObjectPrimitiveNoDefault(null);
			item1.setStandardObjectPrimitiveWithDefault(null);
			// item.setStandardPrimitiveNoDefault(value);
			// item.setStandardPrimitiveWithDefault(value);
			item1.setStandardStringDefault(null);
			item1.setStandardStringNoDefault(null);
			item1.setUnSettableEnum(null);
			item1.setUnSettableObjectPrimitiveNoDefault(null);
			item1.setUnSettableObjectPrimitiveWithDefault(null);
			// item.setUnSettablePrimitiveNoDefault(null);
			// item.setUnSettablePrimitiveWithDefault(null);
			item1.setUnSettableStringNoDefault(null);
			item1.setUnSettableStringWithDefault(null);
			store.store(item1);
			// printValues(item1, "ITEM");
			store.commitTransaction();

			store.beginTransaction();
			Item item2 = store.getObject(Item.class);
			// printValues(item2, "ITEM2");
			compareAfterNullify(item1, item2);

			// now set some values

			store.commitTransaction();
		}

		{
			store.beginTransaction();
			Item item1 = store.getObject(Item.class);
			item1.setStandardEnum(ENUM_VALUE);
			item1.setStandardObjectPrimitiveNoDefault(LNG_OBJ_VALUE);
			item1.setStandardObjectPrimitiveWithDefault(LNG_OBJ_VALUE);
			item1.setStandardPrimitiveNoDefault(LNG_VALUE);
			item1.setStandardPrimitiveWithDefault(LNG_VALUE);
			item1.setStandardStringDefault(STR_VALUE);
			item1.setStandardStringNoDefault(STR_VALUE);
			item1.setUnSettableEnum(ENUM_VALUE);
			item1.setUnSettableObjectPrimitiveNoDefault(LNG_OBJ_VALUE);
			item1.setUnSettableObjectPrimitiveWithDefault(LNG_OBJ_VALUE);
			item1.setUnSettablePrimitiveNoDefault(LNG_VALUE);
			item1.setUnSettablePrimitiveWithDefault(LNG_VALUE);
			item1.setUnSettableStringNoDefault(STR_VALUE);
			item1.setUnSettableStringWithDefault(STR_VALUE);
			store.commitTransaction();

			store.beginTransaction();
			Item item2 = store.getObject(Item.class);
			for (EAttribute eAttribute : item1.eClass().getEAllAttributes()) {
				if (eAttribute.getName().toLowerCase().contains("standard")
						|| eAttribute.getName().toLowerCase().contains("unsettable")) {
					final Object value1 = item1.eGet(eAttribute);
					final Object value2 = item2.eGet(eAttribute);
					assertTrue("Comparing " + eAttribute.getName(), value1 == value2 || value1.equals(value2));
				}
			}

			item2.unsetUnSettableEnum();
			item2.unsetUnSettableObjectPrimitiveNoDefault();
			item2.unsetUnSettableObjectPrimitiveWithDefault();
			item2.unsetUnSettablePrimitiveNoDefault();
			item2.unsetUnSettablePrimitiveWithDefault();
			item2.unsetUnSettableStringNoDefault();
			item2.unsetUnSettableStringWithDefault();
			printValues(item2, "UNSET BEFORE COMMIT");
			store.commitTransaction();
			store.beginTransaction();
			Item item3 = store.getObject(Item.class);
			printValues(item3, "UNSET AFTER READ");

			if (isConvertUnsetToNull()) {
				assertTrue(item3.isSetUnSettableEnum());
				assertTrue(item3.isSetUnSettableObjectPrimitiveNoDefault());
				assertTrue(item3.isSetUnSettableObjectPrimitiveWithDefault());
				assertFalse(item3.isSetUnSettablePrimitiveNoDefault());
				assertFalse(item3.isSetUnSettablePrimitiveWithDefault());
				assertTrue(item3.isSetUnSettableStringNoDefault());
				assertTrue(item3.isSetUnSettableStringWithDefault());
			} else if (isHandleUnsetAsNull()) {
				assertFalse(item3.isSetUnSettableEnum());
				assertFalse(item3.isSetUnSettableObjectPrimitiveNoDefault());
				assertFalse(item3.isSetUnSettableObjectPrimitiveWithDefault());
				assertFalse(item3.isSetUnSettablePrimitiveNoDefault());
				assertFalse(item3.isSetUnSettablePrimitiveWithDefault());
				assertFalse(item3.isSetUnSettableStringNoDefault());
				assertFalse(item3.isSetUnSettableStringWithDefault());
			} else {
				assertFalse(item3.isSetUnSettableEnum());
				assertTrue(item3.isSetUnSettableObjectPrimitiveNoDefault());
				assertFalse(item3.isSetUnSettableObjectPrimitiveWithDefault());
				assertFalse(item3.isSetUnSettablePrimitiveNoDefault());
				assertFalse(item3.isSetUnSettablePrimitiveWithDefault());
				assertFalse(item3.isSetUnSettableStringNoDefault());
				assertFalse(item3.isSetUnSettableStringWithDefault());
			}

			store.commitTransaction();
		}

	}

	protected boolean isConvertUnsetToNull() {
		return false;
	}

	protected boolean isHandleUnsetAsNull() {
		return false;
	}

	private void printValues(Item item, String msg) {
		System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.err.println(msg);
		for (EAttribute eAttribute : item.eClass().getEAllAttributes()) {
			System.err.println(eAttribute.getName() + " --> " + item.eGet(eAttribute) + " isset: "
					+ item.eIsSet(eAttribute));
		}
	}

	private void compareAfterNullify(Item item1, Item item2) {
		for (EAttribute eAttribute : item1.eClass().getEAllAttributes()) {
			if (eAttribute.getName().toLowerCase().contains("standard")
					|| eAttribute.getName().toLowerCase().contains("unsettable")) {
				final Object value1 = item1.eGet(eAttribute);
				final Object value2 = item2.eGet(eAttribute);
				assertTrue("Comparing " + eAttribute.getName() + " " + value1 + " " + value2,
						value1 == value2 || (value1 != null && value1.equals(value2)));
				if (eAttribute.getEAttributeType() instanceof EEnum && eAttribute.isUnsettable()) {
					if (!isHandleUnsetAsNull() && !isConvertUnsetToNull()) {
						assertTrue(item1.eIsSet(eAttribute));
						assertFalse(item2.eIsSet(eAttribute));
					} else {
						assertEquals("Isset equal for " + eAttribute.getName(), item1.eIsSet(eAttribute),
								item2.eIsSet(eAttribute));
					}
					// } else if (!isHandleUnsetAsNull() && eAttribute.getDefaultValue()
					// == null
					// && eAttribute.isUnsettable()) {
					// // with handle unset as null, isset is always false for null values
					// assertTrue(eAttribute.getName(), item1.eIsSet(eAttribute));
					// assertTrue(eAttribute.getName(), item2.eIsSet(eAttribute));
				} else {
					assertEquals("Isset equal for " + eAttribute.getName(), item1.eIsSet(eAttribute),
							item2.eIsSet(eAttribute));
				}
			}
		}
	}

}
