/**
 */
package org.lpdql.jobSearch;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experience</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.jobSearch.Experience#getEntreprise <em>Entreprise</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.Experience#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.Experience#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.Experience#getPoste <em>Poste</em>}</li>
 * </ul>
 *
 * @see org.lpdql.jobSearch.JobSearchPackage#getExperience()
 * @model
 * @generated
 */
public interface Experience extends EObject {
	/**
	 * Returns the value of the '<em><b>Entreprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entreprise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entreprise</em>' attribute.
	 * @see #setEntreprise(String)
	 * @see org.lpdql.jobSearch.JobSearchPackage#getExperience_Entreprise()
	 * @model
	 * @generated
	 */
	String getEntreprise();

	/**
	 * Sets the value of the '{@link org.lpdql.jobSearch.Experience#getEntreprise <em>Entreprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entreprise</em>' attribute.
	 * @see #getEntreprise()
	 * @generated
	 */
	void setEntreprise(String value);

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(Date)
	 * @see org.lpdql.jobSearch.JobSearchPackage#getExperience_DateDebut()
	 * @model
	 * @generated
	 */
	Date getDateDebut();

	/**
	 * Sets the value of the '{@link org.lpdql.jobSearch.Experience#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(Date)
	 * @see org.lpdql.jobSearch.JobSearchPackage#getExperience_DateFin()
	 * @model
	 * @generated
	 */
	Date getDateFin();

	/**
	 * Sets the value of the '{@link org.lpdql.jobSearch.Experience#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(Date value);

	/**
	 * Returns the value of the '<em><b>Poste</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poste</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poste</em>' attribute.
	 * @see #setPoste(String)
	 * @see org.lpdql.jobSearch.JobSearchPackage#getExperience_Poste()
	 * @model
	 * @generated
	 */
	String getPoste();

	/**
	 * Sets the value of the '{@link org.lpdql.jobSearch.Experience#getPoste <em>Poste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poste</em>' attribute.
	 * @see #getPoste()
	 * @generated
	 */
	void setPoste(String value);

} // Experience
