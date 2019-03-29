/**
 */
package org.lpdql.jobSearch;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diplome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.jobSearch.Diplome#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.Diplome#getDomaine <em>Domaine</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.Diplome#getAnneeObtention <em>Annee Obtention</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.Diplome#getEtablissement <em>Etablissement</em>}</li>
 * </ul>
 *
 * @see org.lpdql.jobSearch.JobSearchPackage#getDiplome()
 * @model
 * @generated
 */
public interface Diplome extends EObject {
	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see #setNiveau(String)
	 * @see org.lpdql.jobSearch.JobSearchPackage#getDiplome_Niveau()
	 * @model
	 * @generated
	 */
	String getNiveau();

	/**
	 * Sets the value of the '{@link org.lpdql.jobSearch.Diplome#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(String value);

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
	 * @see org.lpdql.jobSearch.JobSearchPackage#getDiplome_Domaine()
	 * @model
	 * @generated
	 */
	String getDomaine();

	/**
	 * Sets the value of the '{@link org.lpdql.jobSearch.Diplome#getDomaine <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domaine</em>' attribute.
	 * @see #getDomaine()
	 * @generated
	 */
	void setDomaine(String value);

	/**
	 * Returns the value of the '<em><b>Annee Obtention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annee Obtention</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annee Obtention</em>' attribute.
	 * @see #setAnneeObtention(Date)
	 * @see org.lpdql.jobSearch.JobSearchPackage#getDiplome_AnneeObtention()
	 * @model
	 * @generated
	 */
	Date getAnneeObtention();

	/**
	 * Sets the value of the '{@link org.lpdql.jobSearch.Diplome#getAnneeObtention <em>Annee Obtention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annee Obtention</em>' attribute.
	 * @see #getAnneeObtention()
	 * @generated
	 */
	void setAnneeObtention(Date value);

	/**
	 * Returns the value of the '<em><b>Etablissement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etablissement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etablissement</em>' attribute.
	 * @see #setEtablissement(String)
	 * @see org.lpdql.jobSearch.JobSearchPackage#getDiplome_Etablissement()
	 * @model
	 * @generated
	 */
	String getEtablissement();

	/**
	 * Sets the value of the '{@link org.lpdql.jobSearch.Diplome#getEtablissement <em>Etablissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etablissement</em>' attribute.
	 * @see #getEtablissement()
	 * @generated
	 */
	void setEtablissement(String value);

} // Diplome
