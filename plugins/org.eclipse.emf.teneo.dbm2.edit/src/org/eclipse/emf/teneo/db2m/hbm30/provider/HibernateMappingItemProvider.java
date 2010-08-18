/**
 * <copyright>
 * </copyright>
 *
 * $Id: HibernateMappingItemProvider.java,v 1.1 2010/08/18 09:29:33 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HibernateMappingItemProvider
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
	public HibernateMappingItemProvider(AdapterFactory adapterFactory) {
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

			addAutoImportPropertyDescriptor(object);
			addCatalogPropertyDescriptor(object);
			addDefaultAccessPropertyDescriptor(object);
			addDefaultCascadePropertyDescriptor(object);
			addDefaultLazyPropertyDescriptor(object);
			addPackagePropertyDescriptor(object);
			addSchemaPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Auto Import feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoImportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HibernateMapping_autoImport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HibernateMapping_autoImport_feature", "_UI_HibernateMapping_type"),
				 Hbm30Package.eINSTANCE.getHibernateMapping_AutoImport(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_HibernateMapping_catalog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HibernateMapping_catalog_feature", "_UI_HibernateMapping_type"),
				 Hbm30Package.eINSTANCE.getHibernateMapping_Catalog(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Access feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultAccessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HibernateMapping_defaultAccess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HibernateMapping_defaultAccess_feature", "_UI_HibernateMapping_type"),
				 Hbm30Package.eINSTANCE.getHibernateMapping_DefaultAccess(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Cascade feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCascadePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HibernateMapping_defaultCascade_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HibernateMapping_defaultCascade_feature", "_UI_HibernateMapping_type"),
				 Hbm30Package.eINSTANCE.getHibernateMapping_DefaultCascade(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Lazy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultLazyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HibernateMapping_defaultLazy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HibernateMapping_defaultLazy_feature", "_UI_HibernateMapping_type"),
				 Hbm30Package.eINSTANCE.getHibernateMapping_DefaultLazy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HibernateMapping_package_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HibernateMapping_package_feature", "_UI_HibernateMapping_type"),
				 Hbm30Package.eINSTANCE.getHibernateMapping_Package(),
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
				 getString("_UI_HibernateMapping_schema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HibernateMapping_schema_feature", "_UI_HibernateMapping_type"),
				 Hbm30Package.eINSTANCE.getHibernateMapping_Schema(),
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
			childrenFeatures.add(Hbm30Package.eINSTANCE.getHibernateMapping_Meta());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getHibernateMapping_Typedef());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getHibernateMapping_Import());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getHibernateMapping_Group());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getHibernateMapping_Resultset());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getHibernateMapping_Group1());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getHibernateMapping_FilterDef());
			childrenFeatures.add(Hbm30Package.eINSTANCE.getHibernateMapping_DatabaseObject());
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
	 * This returns HibernateMapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HibernateMapping"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		HibernateMapping hibernateMapping = (HibernateMapping)object;
		return getString("_UI_HibernateMapping_type") + " " + hibernateMapping.isAutoImport();
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

		switch (notification.getFeatureID(HibernateMapping.class)) {
			case Hbm30Package.HIBERNATE_MAPPING__AUTO_IMPORT:
			case Hbm30Package.HIBERNATE_MAPPING__CATALOG:
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_ACCESS:
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_CASCADE:
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_LAZY:
			case Hbm30Package.HIBERNATE_MAPPING__PACKAGE:
			case Hbm30Package.HIBERNATE_MAPPING__SCHEMA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Hbm30Package.HIBERNATE_MAPPING__META:
			case Hbm30Package.HIBERNATE_MAPPING__TYPEDEF:
			case Hbm30Package.HIBERNATE_MAPPING__IMPORT:
			case Hbm30Package.HIBERNATE_MAPPING__GROUP:
			case Hbm30Package.HIBERNATE_MAPPING__RESULTSET:
			case Hbm30Package.HIBERNATE_MAPPING__GROUP1:
			case Hbm30Package.HIBERNATE_MAPPING__FILTER_DEF:
			case Hbm30Package.HIBERNATE_MAPPING__DATABASE_OBJECT:
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
				(Hbm30Package.eINSTANCE.getHibernateMapping_Meta(),
				 Hbm30Factory.eINSTANCE.createMeta()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getHibernateMapping_Typedef(),
				 Hbm30Factory.eINSTANCE.createTypedef()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getHibernateMapping_Import(),
				 Hbm30Factory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getHibernateMapping_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getHibernateMapping_Class(),
					 Hbm30Factory.eINSTANCE.createClass())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getHibernateMapping_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getHibernateMapping_Subclass(),
					 Hbm30Factory.eINSTANCE.createSubclass())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getHibernateMapping_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getHibernateMapping_JoinedSubclass(),
					 Hbm30Factory.eINSTANCE.createJoinedSubclass())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getHibernateMapping_Group(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getHibernateMapping_UnionSubclass(),
					 Hbm30Factory.eINSTANCE.createUnionSubclass())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getHibernateMapping_Resultset(),
				 Hbm30Factory.eINSTANCE.createResultset()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getHibernateMapping_Group1(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getHibernateMapping_Query(),
					 Hbm30Factory.eINSTANCE.createQuery())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getHibernateMapping_Group1(),
				 FeatureMapUtil.createEntry
					(Hbm30Package.eINSTANCE.getHibernateMapping_SqlQuery(),
					 Hbm30Factory.eINSTANCE.createSqlQuery())));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getHibernateMapping_FilterDef(),
				 Hbm30Factory.eINSTANCE.createFilterDef()));

		newChildDescriptors.add
			(createChildParameter
				(Hbm30Package.eINSTANCE.getHibernateMapping_DatabaseObject(),
				 Hbm30Factory.eINSTANCE.createDatabaseObject()));
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
