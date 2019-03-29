/**
 */
package org.lpdql.jobSearch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.jobSearch.JobSearch#getCandidat <em>Candidat</em>}</li>
 *   <li>{@link org.lpdql.jobSearch.JobSearch#getEntreprise <em>Entreprise</em>}</li>
 * </ul>
 *
 * @see org.lpdql.jobSearch.JobSearchPackage#getJobSearch()
 * @model
 * @generated
 */
public interface JobSearch extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Candidat</b></em>' containment reference list.
	 * The list contents are of type {@link org.lpdql.jobSearch.Candidat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidat</em>' containment reference list.
	 * @see org.lpdql.jobSearch.JobSearchPackage#getJobSearch_Candidat()
	 * @model containment="true"
	 * @generated
	 */
	EList<Candidat> getCandidat();

	/**
	 * Returns the value of the '<em><b>Entreprise</b></em>' containment reference list.
	 * The list contents are of type {@link org.lpdql.jobSearch.Entreprise}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entreprise</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entreprise</em>' containment reference list.
	 * @see org.lpdql.jobSearch.JobSearchPackage#getJobSearch_Entreprise()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entreprise> getEntreprise();

} // JobSearch
