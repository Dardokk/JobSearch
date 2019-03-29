/**
 */
package org.lpdql.jobSearch.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lpdql.jobSearch.Contact;
import org.lpdql.jobSearch.JobSearchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.jobSearch.impl.ContactImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.ContactImpl#getVille <em>Ville</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.ContactImpl#getCodePostal <em>Code Postal</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.ContactImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.impl.ContactImpl#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactImpl extends MinimalEObjectImpl.Container implements Contact {
	/**
	 * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected String adresse = ADRESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVille() <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVille()
	 * @generated
	 * @ordered
	 */
	protected static final String VILLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVille() <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVille()
	 * @generated
	 * @ordered
	 */
	protected String ville = VILLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodePostal() <em>Code Postal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePostal()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_POSTAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodePostal() <em>Code Postal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePostal()
	 * @generated
	 * @ordered
	 */
	protected int codePostal = CODE_POSTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final int TELEPHONE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected int telephone = TELEPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobSearchPackage.Literals.CONTACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.CONTACT__ADRESSE, oldAdresse,
					adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVille(String newVille) {
		String oldVille = ville;
		ville = newVille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.CONTACT__VILLE, oldVille, ville));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePostal(int newCodePostal) {
		int oldCodePostal = codePostal;
		codePostal = newCodePostal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.CONTACT__CODE_POSTAL, oldCodePostal,
					codePostal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTelephone() {
		return telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephone(int newTelephone) {
		int oldTelephone = telephone;
		telephone = newTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.CONTACT__TELEPHONE, oldTelephone,
					telephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobSearchPackage.CONTACT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JobSearchPackage.CONTACT__ADRESSE:
			return getAdresse();
		case JobSearchPackage.CONTACT__VILLE:
			return getVille();
		case JobSearchPackage.CONTACT__CODE_POSTAL:
			return getCodePostal();
		case JobSearchPackage.CONTACT__TELEPHONE:
			return getTelephone();
		case JobSearchPackage.CONTACT__EMAIL:
			return getEmail();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JobSearchPackage.CONTACT__ADRESSE:
			setAdresse((String) newValue);
			return;
		case JobSearchPackage.CONTACT__VILLE:
			setVille((String) newValue);
			return;
		case JobSearchPackage.CONTACT__CODE_POSTAL:
			setCodePostal((Integer) newValue);
			return;
		case JobSearchPackage.CONTACT__TELEPHONE:
			setTelephone((Integer) newValue);
			return;
		case JobSearchPackage.CONTACT__EMAIL:
			setEmail((String) newValue);
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
		case JobSearchPackage.CONTACT__ADRESSE:
			setAdresse(ADRESSE_EDEFAULT);
			return;
		case JobSearchPackage.CONTACT__VILLE:
			setVille(VILLE_EDEFAULT);
			return;
		case JobSearchPackage.CONTACT__CODE_POSTAL:
			setCodePostal(CODE_POSTAL_EDEFAULT);
			return;
		case JobSearchPackage.CONTACT__TELEPHONE:
			setTelephone(TELEPHONE_EDEFAULT);
			return;
		case JobSearchPackage.CONTACT__EMAIL:
			setEmail(EMAIL_EDEFAULT);
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
		case JobSearchPackage.CONTACT__ADRESSE:
			return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
		case JobSearchPackage.CONTACT__VILLE:
			return VILLE_EDEFAULT == null ? ville != null : !VILLE_EDEFAULT.equals(ville);
		case JobSearchPackage.CONTACT__CODE_POSTAL:
			return codePostal != CODE_POSTAL_EDEFAULT;
		case JobSearchPackage.CONTACT__TELEPHONE:
			return telephone != TELEPHONE_EDEFAULT;
		case JobSearchPackage.CONTACT__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
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
		result.append(" (adresse: ");
		result.append(adresse);
		result.append(", ville: ");
		result.append(ville);
		result.append(", codePostal: ");
		result.append(codePostal);
		result.append(", telephone: ");
		result.append(telephone);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //ContactImpl
