/**
 */
package org.lpdql.jobSearch.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lpdql.jobSearch.Contact;
import org.lpdql.jobSearch.Entreprise;
import org.lpdql.jobSearch.JobSearchPackage;
import org.lpdql.jobSearch.OffreEmploi;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entreprise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.jobSearch.impl.EntrepriseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.EntrepriseImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.EntrepriseImpl#getDomaine <em>Domaine</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.EntrepriseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.EntrepriseImpl#getPublier <em>Publier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntrepriseImpl extends MinimalEObjectImpl.Container implements Entreprise {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected Contact contact;

	/**
	 * The default value of the '{@link #getDomaine() <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaine()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomaine() <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaine()
	 * @generated
	 * @ordered
	 */
	protected String domaine = DOMAINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublier() <em>Publier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublier()
	 * @generated
	 * @ordered
	 */
	protected EList<OffreEmploi> publier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntrepriseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobSearchPackage.Literals.ENTREPRISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.ENTREPRISE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact getContact() {
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContact(Contact newContact, NotificationChain msgs) {
		Contact oldContact = contact;
		contact = newContact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JobSearchPackage.ENTREPRISE__CONTACT, oldContact, newContact);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContact(Contact newContact) {
		if (newContact != contact) {
			NotificationChain msgs = null;
			if (contact != null)
				msgs = ((InternalEObject) contact).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JobSearchPackage.ENTREPRISE__CONTACT, null, msgs);
			if (newContact != null)
				msgs = ((InternalEObject) newContact).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JobSearchPackage.ENTREPRISE__CONTACT, null, msgs);
			msgs = basicSetContact(newContact, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.ENTREPRISE__CONTACT, newContact,
					newContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomaine() {
		return domaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomaine(String newDomaine) {
		String oldDomaine = domaine;
		domaine = newDomaine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.ENTREPRISE__DOMAINE, oldDomaine,
					domaine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.ENTREPRISE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OffreEmploi> getPublier() {
		if (publier == null) {
			publier = new EObjectContainmentEList<OffreEmploi>(OffreEmploi.class, this,
					JobSearchPackage.ENTREPRISE__PUBLIER);
		}
		return publier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JobSearchPackage.ENTREPRISE__CONTACT:
			return basicSetContact(null, msgs);
		case JobSearchPackage.ENTREPRISE__PUBLIER:
			return ((InternalEList<?>) getPublier()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JobSearchPackage.ENTREPRISE__NAME:
			return getName();
		case JobSearchPackage.ENTREPRISE__CONTACT:
			return getContact();
		case JobSearchPackage.ENTREPRISE__DOMAINE:
			return getDomaine();
		case JobSearchPackage.ENTREPRISE__DESCRIPTION:
			return getDescription();
		case JobSearchPackage.ENTREPRISE__PUBLIER:
			return getPublier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JobSearchPackage.ENTREPRISE__NAME:
			setName((String) newValue);
			return;
		case JobSearchPackage.ENTREPRISE__CONTACT:
			setContact((Contact) newValue);
			return;
		case JobSearchPackage.ENTREPRISE__DOMAINE:
			setDomaine((String) newValue);
			return;
		case JobSearchPackage.ENTREPRISE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case JobSearchPackage.ENTREPRISE__PUBLIER:
			getPublier().clear();
			getPublier().addAll((Collection<? extends OffreEmploi>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case JobSearchPackage.ENTREPRISE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case JobSearchPackage.ENTREPRISE__CONTACT:
			setContact((Contact) null);
			return;
		case JobSearchPackage.ENTREPRISE__DOMAINE:
			setDomaine(DOMAINE_EDEFAULT);
			return;
		case JobSearchPackage.ENTREPRISE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case JobSearchPackage.ENTREPRISE__PUBLIER:
			getPublier().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case JobSearchPackage.ENTREPRISE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case JobSearchPackage.ENTREPRISE__CONTACT:
			return contact != null;
		case JobSearchPackage.ENTREPRISE__DOMAINE:
			return DOMAINE_EDEFAULT == null ? domaine != null : !DOMAINE_EDEFAULT.equals(domaine);
		case JobSearchPackage.ENTREPRISE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case JobSearchPackage.ENTREPRISE__PUBLIER:
			return publier != null && !publier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", domaine: ");
		result.append(domaine);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EntrepriseImpl
