/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubclassItemProvider.java,v 1.1 2010/08/18 09:29:33 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Subclass;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.teneo.db2m.hbm30.Subclass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubclassItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubclassItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAbstractPropertyDescriptor(object);
			addBatchSizePropertyDescriptor(object);
			addDiscriminatorValuePropertyDescriptor(object);
			addDynamicInsertPropertyDescriptor(object);
			addDynamicUpdatePropertyDescriptor(object);
			addEntityNamePropertyDescriptor(object);
			addExtendsPropertyDescriptor(object);
			addLazyPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNodePropertyDescriptor(object);
			addPersisterPropertyDescriptor(object);
			addProxyPropertyDescriptor(object);
			addSelectBeforeUpdatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subclass_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subclass_abstract_feature", "_UI_Subclass_type"),
				 Hbm30Package.eINSTANCE.getSubclass_Abstract(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Batch Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBatchSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subclass_batchSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subclass_batchSize_feature", "_UI_Subclass_type"),
				 Hbm30Package.eINSTANCE.getSubclass_BatchSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Discriminator Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiscriminatorValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subclass_discriminatorValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subclass_discriminatorValue_feature", "_UI_Subclass_type"),
				 Hbm30Package.eINSTANCE.getSubclass_DiscriminatorValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dynamic Insert feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicInsertPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subclass_dynamicInsert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subclass_dynamicInsert_feature", "_UI_Subclass_type"),
				 Hbm30Package.eINSTANCE.getSubclass_DynamicInsert(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dynamic Update feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicUpdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subclass_dynamicUpdate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subclass_dynamicUpdate_feature", "_UI_Subclass_type"),
				 Hbm30Package.eINSTANCE.getSubclass_DynamicUpdate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entity Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntityNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subclass_entityName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subclass_entityName_feature", "_UI_Subclass_type"),
				 Hbm30Package.eINSTANCE.getSubclass_EntityName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extends feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subclass_extends_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subclass_extends_feature", "_UI_Subclass_type"),
				 Hbm30Package.eINSTANCE.getSubclass_Extends(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lazy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLazyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subclass_lazy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subclass_lazy_feature", "_UI_Subclass_type"),
				 Hbm30Package.eINSTANCE.getSubclass_Lazy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subclass_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subclass_name_feature", "_UI_Subclass_type"),
				 Hbm30Package.eINSTANCE.getSubclass_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subclass_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subclass_node_feature", "_UI_Subclass_type"),
				 Hbm30Package.eINSTANCE.getSubclass_Node(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Persister feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersisterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subclass_persister_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subclass_persister_feature", "_UI_Subclass_type"),
				 Hbm30Package.eINSTANCE.getSubclass_Persister(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Proxy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProxyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subclass_proxy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subclass_proxy_feature", "_UI_Subclass_type"),
				 Hbm30Package.eINSTANCE.getSubclass_Proxy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Before Update feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectBeforeUpdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subclass_selectBeforeUpdate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subclass_selectBeforeUpdate_feature", "_UI_Subclass_type"),
				 Hbm30Package.eINSTANCE.getSubclass_SelectBeforeUpdate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Hbm30Package.eINSTANCE.getSubclass_Meta());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getSubclass_Tuplizer());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getSubclass_Synchronize());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getSubclass_Group());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getSubclass_Join());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getSubclass_Subclass());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getSubclass_Loader());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getSubclass_SqlInsert());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getSubclass_SqlUpdate());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getSubclass_SqlDelete());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getSubclass_Resultset());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getSubclass_Group1());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Subclass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Subclass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Subclass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Subclass_type") :
			getString("_UI_Subclass_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Subclass.class)) {
			case Hbm30Package.SUBCLASS__ABSTRACT:
			case Hbm30Package.SUBCLASS__BATCH_SIZE:
			case Hbm30Package.SUBCLASS__DISCRIMINATOR_VALUE:
			case Hbm30Package.SUBCLASS__DYNAMIC_INSERT:
			case Hbm30Package.SUBCLASS__DYNAMIC_UPDATE:
			case Hbm30Package.SUBCLASS__ENTITY_NAME:
			case Hbm30Package.SUBCLASS__EXTENDS:
			case Hbm30Package.SUBCLASS__LAZY:
			case Hbm30Package.SUBCLASS__NAME:
			case Hbm30Package.SUBCLASS__NODE:
			case Hbm30Package.SUBCLASS__PERSISTER:
			case Hbm30Package.SUBCLASS__PROXY:
			case Hbm30Package.SUBCLASS__SELECT_BEFORE_UPDATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Hbm30Package.SUBCLASS__META:
			case Hbm30Package.SUBCLASS__TUPLIZER:
			case Hbm30Package.SUBCLASS__SYNCHRONIZE:
			case Hbm30Package.SUBCLASS__GROUP:
			case Hbm30Package.SUBCLASS__JOIN:
			case Hbm30Package.SUBCLASS__SUBCLASS:
			case Hbm30Package.SUBCLASS__LOADER:
			case Hbm30Package.SUBCLASS__SQL_INSERT:
			case Hbm30Package.SUBCLASS__SQL_UPDATE:
			case Hbm30Package.SUBCLASS__SQL_DELETE:
			case Hbm30Package.SUBCLASS__RESULTSET:
			case Hbm30Package.SUBCLASS__GROUP1:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Meta(),
				 Hbm30Factory.eINSTANCE.createMeta()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Tuplizer(),
				 Hbm30Factory.eINSTANCE.createTuplizer()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Synchronize(),
				 Hbm30Factory.eINSTANCE.createSynchronize()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_Property(),
					 Hbm30Factory.eINSTANCE.createProperty())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_ManyToOne(),
					 Hbm30Factory.eINSTANCE.createManyToOne())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_OneToOne(),
					 Hbm30Factory.eINSTANCE.createOneToOne())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_Component(),
					 Hbm30Factory.eINSTANCE.createComponent())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_DynamicComponent(),
					 Hbm30Factory.eINSTANCE.createDynamicComponent())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_Any(),
					 Hbm30Factory.eINSTANCE.createAny())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_Map(),
					 Hbm30Factory.eINSTANCE.createMap())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_Set(),
					 Hbm30Factory.eINSTANCE.createSet())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_List(),
					 Hbm30Factory.eINSTANCE.createList())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_Bag(),
					 Hbm30Factory.eINSTANCE.createBag())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_Idbag(),
					 Hbm30Factory.eINSTANCE.createIdbag())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_Array(),
					 Hbm30Factory.eINSTANCE.createArray())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_PrimitiveArray(),
					 Hbm30Factory.eINSTANCE.createPrimitiveArray())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Join(),
				 Hbm30Factory.eINSTANCE.createJoin()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Subclass(),
				 Hbm30Factory.eINSTANCE.createSubclass()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Loader(),
				 Hbm30Factory.eINSTANCE.createLoader()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_SqlInsert(),
				 Hbm30Factory.eINSTANCE.createSqlInsert()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_SqlUpdate(),
				 Hbm30Factory.eINSTANCE.createSqlUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_SqlDelete(),
				 Hbm30Factory.eINSTANCE.createSqlDelete()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Resultset(),
				 Hbm30Factory.eINSTANCE.createResultset()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group1(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_Query(),
					 Hbm30Factory.eINSTANCE.createQuery())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getSubclass_Group1(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getSubclass_SqlQuery(),
					 Hbm30Factory.eINSTANCE.createSqlQuery())));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Hbm30EditPlugin.INSTANCE;
	}

}
