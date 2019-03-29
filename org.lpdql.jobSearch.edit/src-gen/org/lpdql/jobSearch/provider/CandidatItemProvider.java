/**
 */
package org.lpdql.jobSearch.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import org.lpdql.jobSearch.Candidat;
import org.lpdql.jobSearch.JobSearchFactory;
import org.lpdql.jobSearch.JobSearchPackage;

/**
 * This is the item provider adapter for a {@link org.lpdql.jobSearch.Candidat} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CandidatItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandidatItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addPrenomPropertyDescriptor(object);
			addGenrePropertyDescriptor(object);
			addDateNaissancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NamedElement_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature",
								"_UI_NamedElement_type"),
						JobSearchPackage.Literals.NAMED_ELEMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prenom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrenomPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Candidat_prenom_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Candidat_prenom_feature",
								"_UI_Candidat_type"),
						JobSearchPackage.Literals.CANDIDAT__PRENOM, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Genre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenrePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Candidat_genre_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Candidat_genre_feature",
								"_UI_Candidat_type"),
						JobSearchPackage.Literals.CANDIDAT__GENRE, true, false, false,
						ItemPropertyDescriptor.TEXT_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Date Naissance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateNaissancePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Candidat_dateNaissance_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Candidat_dateNaissance_feature",
								"_UI_Candidat_type"),
						JobSearchPackage.Literals.CANDIDAT__DATE_NAISSANCE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(JobSearchPackage.Literals.CANDIDAT__DIPLOME);
			childrenFeatures.add(JobSearchPackage.Literals.CANDIDAT__EXPERIENCE);
			childrenFeatures.add(JobSearchPackage.Literals.CANDIDAT__CONTACT);
			childrenFeatures.add(JobSearchPackage.Literals.CANDIDAT__COMPETENCE);
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
	 * This returns Candidat.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Candidat"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Candidat) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Candidat_type")
				: getString("_UI_Candidat_type") + " " + label;
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

		switch (notification.getFeatureID(Candidat.class)) {
		case JobSearchPackage.CANDIDAT__NAME:
		case JobSearchPackage.CANDIDAT__PRENOM:
		case JobSearchPackage.CANDIDAT__GENRE:
		case JobSearchPackage.CANDIDAT__DATE_NAISSANCE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case JobSearchPackage.CANDIDAT__DIPLOME:
		case JobSearchPackage.CANDIDAT__EXPERIENCE:
		case JobSearchPackage.CANDIDAT__CONTACT:
		case JobSearchPackage.CANDIDAT__COMPETENCE:
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

		newChildDescriptors.add(createChildParameter(JobSearchPackage.Literals.CANDIDAT__DIPLOME,
				JobSearchFactory.eINSTANCE.createDiplome()));

		newChildDescriptors.add(createChildParameter(JobSearchPackage.Literals.CANDIDAT__EXPERIENCE,
				JobSearchFactory.eINSTANCE.createExperience()));

		newChildDescriptors.add(createChildParameter(JobSearchPackage.Literals.CANDIDAT__CONTACT,
				JobSearchFactory.eINSTANCE.createContact()));

		newChildDescriptors.add(createChildParameter(JobSearchPackage.Literals.CANDIDAT__COMPETENCE,
				JobSearchFactory.eINSTANCE.createCompetence()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return JobSearchEditPlugin.INSTANCE;
	}

}
