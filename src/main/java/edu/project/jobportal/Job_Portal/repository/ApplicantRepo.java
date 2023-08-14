package edu.project.jobportal.Job_Portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.project.jobportal.Job_Portal.entity.Applicant;

public interface ApplicantRepo  extends JpaRepository<Applicant, Long>{

}
