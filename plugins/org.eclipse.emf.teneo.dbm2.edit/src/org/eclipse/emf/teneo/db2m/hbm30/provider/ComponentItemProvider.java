/**
 * <copyright>
 * </copyright>
 *
 * $Id: ComponentItemProvider.java,v 1.1 2010/08/18 09:29:33 cbouhier Exp $
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

import org.eclipse.emf.teneo.db2m.hbm30.Component;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.teneo.db2m.hbm30.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider
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
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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

			addAccessPropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addInsertPropertyDescriptor(object);
			addLazyPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNodePropertyDescriptor(object);
			addOptimisticLockPropertyDescriptor(object);
			addUniquePropertyDescriptor(object);
			addUpdatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Access feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_access_feature", "_UI_Component_type"),
				 Hbm30Package.eINSTANCE.getComponent_Access(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_class_feature", "_UI_Component_type"),
				 Hbm30Package.eINSTANCE.getComponent_Class(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Insert feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsertPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_insert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_insert_feature", "_UI_Component_type"),
				 Hbm30Package.eINSTANCE.getComponent_Insert(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Component_lazy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_lazy_feature", "_UI_Component_type"),
				 Hbm30Package.eINSTANCE.getComponent_Lazy(),
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
				 getString("_UI_Component_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_name_feature", "_UI_Component_type"),
				 Hbm30Package.eINSTANCE.getComponent_Name(),
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
				 getString("_UI_Component_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_node_feature", "_UI_Component_type"),
				 Hbm30Package.eINSTANCE.getComponent_Node(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Optimistic Lock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptimisticLockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_optimisticLock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_optimisticLock_feature", "_UI_Component_type"),
				 Hbm30Package.eINSTANCE.getComponent_OptimisticLock(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_unique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_unique_feature", "_UI_Component_type"),
				 Hbm30Package.eINSTANCE.getComponent_Unique(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Update feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_update_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_update_feature", "_UI_Component_type"),
				 Hbm30Package.eINSTANCE.getComponent_Update(),
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
			childrenFeatures.add(Hbm30Package.eINSTANCE.getComponent_Meta());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getComponent_Tuplizer());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getComponent_Parent());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getComponent_Group());
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
	 * This returns Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Component)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Component_type") :
			getString("_UI_Component_type") + " " + label;
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

		switch (notification.getFeatureID(Component.class)) {
			case Hbm30Package.COMPONENT__ACCESS:
			case Hbm30Package.COMPONENT__CLASS:
			case Hbm30Package.COMPONENT__INSERT:
			case Hbm30Package.COMPONENT__LAZY:
			case Hbm30Package.COMPONENT__NAME:
			case Hbm30Package.COMPONENT__NODE:
			case Hbm30Package.COMPONENT__OPTIMISTIC_LOCK:
			case Hbm30Package.COMPONENT__UNIQUE:
			case Hbm30Package.COMPONENT__UPDATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Hbm30Package.COMPONENT__META:
			case Hbm30Package.COMPONENT__TUPLIZER:
			case Hbm30Package.COMPONENT__PARENT:
			case Hbm30Package.COMPONENT__GROUP:
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
				(Hbm30Package.eINSTANCE.getComponent_Meta(),
				 Hbm30Factory.eINSTANCE.createMeta()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Tuplizer(),
				 Hbm30Factory.eINSTANCE.createTuplizer()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Parent(),
				 Hbm30Factory.eINSTANCE.createParent()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getComponent_Property(),
					 Hbm30Factory.eINSTANCE.createProperty())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getComponent_ManyToOne(),
					 Hbm30Factory.eINSTANCE.createManyToOne())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getComponent_OneToOne(),
					 Hbm30Factory.eINSTANCE.createOneToOne())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getComponent_Component(),
					 Hbm30Factory.eINSTANCE.createComponent())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getComponent_DynamicComponent(),
					 Hbm30Factory.eINSTANCE.createDynamicComponent())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getComponent_Any(),
					 Hbm30Factory.eINSTANCE.createAny())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getComponent_Map(),
					 Hbm30Factory.eINSTANCE.createMap())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getComponent_Set(),
					 Hbm30Factory.eINSTANCE.createSet())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getComponent_List(),
					 Hbm30Factory.eINSTANCE.createList())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getComponent_Bag(),
					 Hbm30Factory.eINSTANCE.createBag())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getComponent_Array(),
					 Hbm30Factory.eINSTANCE.createArray())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getComponent_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getComponent_PrimitiveArray(),
					 Hbm30Factory.eINSTANCE.createPrimitiveArray())));
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
