/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: EMapWrapper_old.java,v 1.1 2007/02/08 23:14:52 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.elist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.mapping.elist.PersistableEMap;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.jpox.StateManager;
import org.jpox.sco.SCO;
import org.jpox.sco.SCOList;
import org.jpox.state.FetchPlanState;
import org.jpox.store.expression.QueryExpression;
import org.jpox.store.query.Queryable;
import org.jpox.store.query.ResultObjectFactory;

/**
 * Implements the jpox persistable emap.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
@SuppressWarnings("unchecked")
public class EMapWrapper_old<K, V> extends PersistableEMap<K, V>  implements SCO, Queryable, SCOList {
	/**
	 * Serial Version ID
	 */
	private static final long serialVersionUID = -4553160393592497834L;

	/** The statemanager */
	private StateManager ownerSM;

	/** The fieldname of the emap */
	private String fieldName;

	/** The delegate list */
	private EListWrapper<Entry<K, V>> elistWrapper;
	
	/** Constructor */
	public EMapWrapper_old(InternalEObject owner, EReference eref,
			List<Entry<K, V>> list) {
		super(eref.getEReferenceType(), Map.Entry.class, owner, eref
				.getFeatureID());
	}

	/** Set jpox related control information */
	public void setJPOXControlInformation(StateManager ownerSM,
			String fieldName, List<Entry<K, V>> list) {
		this.ownerSM = ownerSM;
		this.fieldName = fieldName;
		final EStructuralFeature estruct = StoreUtil.getEStructuralFeature(
				(InternalEObject) ownerSM.getObject(), fieldName);
		setDelegatePeristableEList((InternalEObject) ownerSM.getObject(),
				estruct, new ArrayList<Entry<K, V>>());
		elistWrapper = (EListWrapper<Entry<K,V>>)delegateEList;;
	}

	/** Needs to be implemented by concrete subclass */
	protected PersistableEList<BasicEMap.Entry<K, V>> createPersistableDelegateList(
			InternalEObject owner, EStructuralFeature feature,
			List<Entry<K, V>> delegateORMList) {
		return new EListWrapper<Entry<K, V>>(ownerSM, fieldName, delegateORMList) {
			private static final long serialVersionUID = 1L;

			@Override
			protected void didAdd(int index, Entry<K, V> newObject) {
				doPut(newObject);
			}

			@Override
			protected void didSet(int index, Entry<K, V> newObject,
					Entry<K, V> oldObject) {
				didRemove(index, oldObject);
				didAdd(index, newObject);
			}

			@Override
			protected void didRemove(int index, Entry<K, V> oldObject) {
				EMapWrapper_old.this.doRemove(oldObject);
			}

			@Override
			protected void didClear(int size, Object[] oldObjects) {
				doClear();
			}

			@Override
			protected void didMove(int index, Entry<K, V> movedObject,
					int oldIndex) {
				EMapWrapper_old.this.doMove(movedObject);
			}
		};
	}

	public void attachCopy(Object value) {
		elistWrapper.attachCopy(value);
	}

	public Object detachCopy(FetchPlanState state) {
		return elistWrapper.detachCopy(state);
	}

	public String getFieldName() {
		return elistWrapper.getFieldName();
	}

	public Object getOwner() {
		return elistWrapper.getOwner();
	}

	public void setValueFrom(Object obj, boolean forUpdate)
			throws ClassCastException {
		elistWrapper.setValueFrom(obj, forUpdate);
	}

	public void unsetOwner() {
		elistWrapper.unsetOwner();
	}

	public QueryExpression newQueryStatement() {
		return elistWrapper.newQueryStatement();
	}

	public QueryExpression newQueryStatement(Class candidateClass) {
		return elistWrapper.newQueryStatement(candidateClass);
	}

	public ResultObjectFactory newResultObjectFactory(QueryExpression stmt,
			boolean ignoreCache, Class resultClass, boolean useFetchPlan) {
		return elistWrapper.newResultObjectFactory(stmt, ignoreCache, resultClass, useFetchPlan);
	}

	public Object set(int index, Object element, boolean allowDependentField) {
		return elistWrapper.set(index, element, allowDependentField);
	}

	public Class getElementType() {
		return elistWrapper.getElementType();
	}

	public void updateEmbeddedElement(Object element, int fieldNumber,
			Object value) {
		elistWrapper.updateEmbeddedElement(element, fieldNumber, value);
	}

	public void detach(FetchPlanState state) {
		elistWrapper.detach(state);
	}

	public void load() {
		elistWrapper.load();
	}

	public void loadFieldsInFetchPlan(FetchPlanState state) {
		elistWrapper.loadFieldsInFetchPlan(state);
	}

	public void makeTransient(FetchPlanState state) {
		elistWrapper.makeTransient(state);
	}

	public void runReachability(Set reachables) {
		elistWrapper.runReachability(reachables);
	}
}