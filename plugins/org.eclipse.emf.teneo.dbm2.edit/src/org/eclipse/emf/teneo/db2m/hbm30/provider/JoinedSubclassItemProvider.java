/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoinedSubclassItemProvider.java,v 1.1 2010/08/18 09:29:33 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JoinedSubclassItemProvider
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
	public JoinedSubclassItemProvider(AdapterFactory adapterFactory) {
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

			addSubselectPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addAbstractPropertyDescriptor(object);
			addBatchSizePropertyDescriptor(object);
			addCatalogPropertyDescriptor(object);
			addCheckPropertyDescriptor(object);
			addDynamicInsertPropertyDescriptor(object);
			addDynamicUpdatePropertyDescriptor(object);
			addEntityNamePropertyDescriptor(object);
			addExtendsPropertyDescriptor(object);
			addLazyPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNodePropertyDescriptor(object);
			addPersisterPropertyDescriptor(object);
			addProxyPropertyDescriptor(object);
			addSchemaPropertyDescriptor(object);
			addSelectBeforeUpdatePropertyDescriptor(object);
			addSubselect1PropertyDescriptor(object);
			addTablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Subselect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubselectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoinedSubclass_subselect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_subselect_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Subselect(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoinedSubclass_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_comment_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Comment(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_JoinedSubclass_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_abstract_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Abstract(),
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
				 getString("_UI_JoinedSubclass_batchSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_batchSize_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_BatchSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Catalog feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCatalogPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoinedSubclass_catalog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_catalog_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Catalog(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Check feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoinedSubclass_check_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_check_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Check(),
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
				 getString("_UI_JoinedSubclass_dynamicInsert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_dynamicInsert_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_DynamicInsert(),
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
				 getString("_UI_JoinedSubclass_dynamicUpdate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_dynamicUpdate_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_DynamicUpdate(),
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
				 getString("_UI_JoinedSubclass_entityName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_entityName_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_EntityName(),
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
				 getString("_UI_JoinedSubclass_extends_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_extends_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Extends(),
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
				 getString("_UI_JoinedSubclass_lazy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_lazy_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Lazy(),
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
				 getString("_UI_JoinedSubclass_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_name_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Name(),
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
				 getString("_UI_JoinedSubclass_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_node_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Node(),
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
				 getString("_UI_JoinedSubclass_persister_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_persister_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Persister(),
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
				 getString("_UI_JoinedSubclass_proxy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_proxy_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Proxy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schema feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoinedSubclass_schema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_schema_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Schema(),
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
				 getString("_UI_JoinedSubclass_selectBeforeUpdate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_selectBeforeUpdate_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_SelectBeforeUpdate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subselect1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubselect1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoinedSubclass_subselect1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_subselect1_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Subselect1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JoinedSubclass_table_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JoinedSubclass_table_feature", "_UI_JoinedSubclass_type"),
				 Hbm30Package.eINSTANCE.getJoinedSubclass_Table(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(Hbm30Package.eINSTANCE.getJoinedSubclass_Meta());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getJoinedSubclass_Synchronize());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getJoinedSubclass_Tuplizer());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getJoinedSubclass_Key());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getJoinedSubclass_Group());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getJoinedSubclass_JoinedSubclass());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getJoinedSubclass_Loader());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getJoinedSubclass_SqlInsert());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getJoinedSubclass_SqlUpdate());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getJoinedSubclass_SqlDelete());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getJoinedSubclass_Resultset());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getJoinedSubclass_Group1());
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
	 * This returns JoinedSubclass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JoinedSubclass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JoinedSubclass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_JoinedSubclass_type") :
			getString("_UI_JoinedSubclass_type") + " " + label;
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

		switch (notification.getFeatureID(JoinedSubclass.class)) {
			case Hbm30Package.JOINED_SUBCLASS__SUBSELECT:
			case Hbm30Package.JOINED_SUBCLASS__COMMENT:
			case Hbm30Package.JOINED_SUBCLASS__ABSTRACT:
			case Hbm30Package.JOINED_SUBCLASS__BATCH_SIZE:
			case Hbm30Package.JOINED_SUBCLASS__CATALOG:
			case Hbm30Package.JOINED_SUBCLASS__CHECK:
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_INSERT:
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_UPDATE:
			case Hbm30Package.JOINED_SUBCLASS__ENTITY_NAME:
			case Hbm30Package.JOINED_SUBCLASS__EXTENDS:
			case Hbm30Package.JOINED_SUBCLASS__LAZY:
			case Hbm30Package.JOINED_SUBCLASS__NAME:
			case Hbm30Package.JOINED_SUBCLASS__NODE:
			case Hbm30Package.JOINED_SUBCLASS__PERSISTER:
			case Hbm30Package.JOINED_SUBCLASS__PROXY:
			case Hbm30Package.JOINED_SUBCLASS__SCHEMA:
			case Hbm30Package.JOINED_SUBCLASS__SELECT_BEFORE_UPDATE:
			case Hbm30Package.JOINED_SUBCLASS__SUBSELECT1:
			case Hbm30Package.JOINED_SUBCLASS__TABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Hbm30Package.JOINED_SUBCLASS__META:
			case Hbm30Package.JOINED_SUBCLASS__SYNCHRONIZE:
			case Hbm30Package.JOINED_SUBCLASS__TUPLIZER:
			case Hbm30Package.JOINED_SUBCLASS__KEY:
			case Hbm30Package.JOINED_SUBCLASS__GROUP:
			case Hbm30Package.JOINED_SUBCLASS__JOINED_SUBCLASS:
			case Hbm30Package.JOINED_SUBCLASS__LOADER:
			case Hbm30Package.JOINED_SUBCLASS__SQL_INSERT:
			case Hbm30Package.JOINED_SUBCLASS__SQL_UPDATE:
			case Hbm30Package.JOINED_SUBCLASS__SQL_DELETE:
			case Hbm30Package.JOINED_SUBCLASS__RESULTSET:
			case Hbm30Package.JOINED_SUBCLASS__GROUP1:
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
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Meta(),
				 Hbm30Factory.eINSTANCE.createMeta()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Synchronize(),
				 Hbm30Factory.eINSTANCE.createSynchronize()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Tuplizer(),
				 Hbm30Factory.eINSTANCE.createTuplizer()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Key(),
				 Hbm30Factory.eINSTANCE.createKey()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_Property(),
					 Hbm30Factory.eINSTANCE.createProperty())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_ManyToOne(),
					 Hbm30Factory.eINSTANCE.createManyToOne())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_OneToOne(),
					 Hbm30Factory.eINSTANCE.createOneToOne())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_Component(),
					 Hbm30Factory.eINSTANCE.createComponent())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_DynamicComponent(),
					 Hbm30Factory.eINSTANCE.createDynamicComponent())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_Properties(),
					 Hbm30Factory.eINSTANCE.createProperties())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_Any(),
					 Hbm30Factory.eINSTANCE.createAny())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_Map(),
					 Hbm30Factory.eINSTANCE.createMap())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_Set(),
					 Hbm30Factory.eINSTANCE.createSet())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_List(),
					 Hbm30Factory.eINSTANCE.createList())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_Bag(),
					 Hbm30Factory.eINSTANCE.createBag())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_Idbag(),
					 Hbm30Factory.eINSTANCE.createIdbag())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_Array(),
					 Hbm30Factory.eINSTANCE.createArray())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_PrimitiveArray(),
					 Hbm30Factory.eINSTANCE.createPrimitiveArray())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_JoinedSubclass(),
				 Hbm30Factory.eINSTANCE.createJoinedSubclass()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Loader(),
				 Hbm30Factory.eINSTANCE.createLoader()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_SqlInsert(),
				 Hbm30Factory.eINSTANCE.createSqlInsert()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_SqlUpdate(),
				 Hbm30Factory.eINSTANCE.createSqlUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_SqlDelete(),
				 Hbm30Factory.eINSTANCE.createSqlDelete()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Resultset(),
				 Hbm30Factory.eINSTANCE.createResultset()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group1(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_Query(),
					 Hbm30Factory.eINSTANCE.createQuery())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getJoinedSubclass_Group1(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getJoinedSubclass_SqlQuery(),
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
