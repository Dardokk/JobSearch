/**
 */
package org.lpdql.jobSearch.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lpdql.jobSearch.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lpdql.jobSearch.JobSearchPackage
 * @generated
 */
public class JobSearchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JobSearchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobSearchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JobSearchPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobSearchSwitch<Adapter> modelSwitch = new JobSearchSwitch<Adapter>() {
		@Override
		public Adapter caseEntreprise(Entreprise object) {
			return createEntrepriseAdapter();
		}

		@Override
		public Adapter caseCandidat(Candidat object) {
			return createCandidatAdapter();
		}

		@Override
		public Adapter caseOffreEmploi(OffreEmploi object) {
			return createOffreEmploiAdapter();
		}

		@Override
		public Adapter caseDiplome(Diplome object) {
			return createDiplomeAdapter();
		}

		@Override
		public Adapter caseExperience(Experience object) {
			return createExperienceAdapter();
		}

		@Override
		public Adapter caseContact(Contact object) {
			return createContactAdapter();
		}

		@Override
		public Adapter caseCompetence(Competence object) {
			return createCompetenceAdapter();
		}

		@Override
		public Adapter caseJobSearch(JobSearch object) {
			return createJobSearchAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.jobSearch.Entreprise <em>Entreprise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.jobSearch.Entreprise
	 * @generated
	 */
	public Adapter createEntrepriseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.jobSearch.Candidat <em>Candidat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.jobSearch.Candidat
	 * @generated
	 */
	public Adapter createCandidatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.jobSearch.OffreEmploi <em>Offre Emploi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.jobSearch.OffreEmploi
	 * @generated
	 */
	public Adapter createOffreEmploiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.jobSearch.Diplome <em>Diplome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.jobSearch.Diplome
	 * @generated
	 */
	public Adapter createDiplomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.jobSearch.Experience <em>Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.jobSearch.Experience
	 * @generated
	 */
	public Adapter createExperienceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.jobSearch.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.jobSearch.Contact
	 * @generated
	 */
	public Adapter createContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.jobSearch.Competence <em>Competence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.jobSearch.Competence
	 * @generated
	 */
	public Adapter createCompetenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.jobSearch.JobSearch <em>Job Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.jobSearch.JobSearch
	 * @generated
	 */
	public Adapter createJobSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.jobSearch.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.jobSearch.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JobSearchAdapterFactory
