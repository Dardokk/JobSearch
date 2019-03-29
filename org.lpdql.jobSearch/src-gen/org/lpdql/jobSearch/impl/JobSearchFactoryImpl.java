/**
 */
package org.lpdql.jobSearch.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lpdql.jobSearch.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobSearchFactoryImpl extends EFactoryImpl implements JobSearchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobSearchFactory init() {
		try {
			JobSearchFactory theJobSearchFactory = (JobSearchFactory) EPackage.Registry.INSTANCE
					.getEFactory(JobSearchPackage.eNS_URI);
			if (theJobSearchFactory != null) {
				return theJobSearchFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JobSearchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobSearchFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case JobSearchPackage.ENTREPRISE:
			return createEntreprise();
		case JobSearchPackage.CANDIDAT:
			return createCandidat();
		case JobSearchPackage.OFFRE_EMPLOI:
			return createOffreEmploi();
		case JobSearchPackage.DIPLOME:
			return createDiplome();
		case JobSearchPackage.EXPERIENCE:
			return createExperience();
		case JobSearchPackage.CONTACT:
			return createContact();
		case JobSearchPackage.COMPETENCE:
			return createCompetence();
		case JobSearchPackage.JOB_SEARCH:
			return createJobSearch();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entreprise createEntreprise() {
		EntrepriseImpl entreprise = new EntrepriseImpl();
		return entreprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candidat createCandidat() {
		CandidatImpl candidat = new CandidatImpl();
		return candidat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffreEmploi createOffreEmploi() {
		OffreEmploiImpl offreEmploi = new OffreEmploiImpl();
		return offreEmploi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diplome createDiplome() {
		DiplomeImpl diplome = new DiplomeImpl();
		return diplome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Experience createExperience() {
		ExperienceImpl experience = new ExperienceImpl();
		return experience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact createContact() {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Competence createCompetence() {
		CompetenceImpl competence = new CompetenceImpl();
		return competence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobSearch createJobSearch() {
		JobSearchImpl jobSearch = new JobSearchImpl();
		return jobSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobSearchPackage getJobSearchPackage() {
		return (JobSearchPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JobSearchPackage getPackage() {
		return JobSearchPackage.eINSTANCE;
	}

} //JobSearchFactoryImpl
