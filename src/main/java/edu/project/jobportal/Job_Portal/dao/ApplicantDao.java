package edu.project.jobportal.Job_Portal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.project.jobportal.Job_Portal.entity.Applicant;
import edu.project.jobportal.Job_Portal.repository.ApplicantRepo;

@Repository
public class ApplicantDao {

	@Autowired
	private ApplicantRepo applicantRepo;
	
	public Applicant addApplicant(Applicant applicant) {
		return applicantRepo.save(applicant);
	}
}
