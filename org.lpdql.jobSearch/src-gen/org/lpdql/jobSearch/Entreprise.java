/**
 */
package org.lpdql.jobSearch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entreprise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.jobSearch.Entreprise#getContact <em>Contact</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.Entreprise#getDomaine <em>Domaine</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.Entreprise#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.Entreprise#getPublier <em>Publier</em>}</li>
 * </ul>
 *
 * @see org.lpdql.jobSearch.JobSearchPackage#getEntreprise()
 * @model
 * @generated
 */
public interface Entreprise extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference.
	 * @see #setContact(Contact)
	 * @see org.lpdql.jobSearch.JobSearchPackage#getEntreprise_Contact()
	 * @model containment="true"
	 * @generated
	 */
	Contact getContact();

	/**
	 * Sets the value of the '{@link org.lpdql.jobSearch.Entreprise#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(Contact value);

	/**
	 * Returns the value of the '<em><b>Domaine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domaine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domaine</em>' attribute.
	 * @see #setDomaine(String)
	 * @see org.lpdql.jobSearch.JobSearchPackage#getEntreprise_Domaine()
	 * @model
	 * @generated
	 */
	String getDomaine();

	/**
	 * Sets the value of the '{@link org.lpdql.jobSearch.Entreprise#getDomaine <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domaine</em>' attribute.
	 * @see #getDomaine()
	 * @generated
	 */
	void setDomaine(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.lpdql.jobSearch.JobSearchPackage#getEntreprise_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.lpdql.jobSearch.Entreprise#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Publier</b></em>' containment reference list.
	 * The list contents are of type {@link org.lpdql.jobSearch.OffreEmploi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publier</em>' containment reference list.
	 * @see org.lpdql.jobSearch.JobSearchPackage#getEntreprise_Publier()
	 * @model containment="true"
	 * @generated
	 */
	EList<OffreEmploi> getPublier();

} // Entreprise
