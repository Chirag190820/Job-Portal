package edu.project.jobportal.Job_Portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.project.jobportal.Job_Portal.entity.Employer;

public interface EmployerRepo extends JpaRepository<Employer, Long> {

}
