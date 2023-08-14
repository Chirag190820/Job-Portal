package edu.project.jobportal.Job_Portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.project.jobportal.Job_Portal.entity.Job;

public interface JobRepo extends JpaRepository<Job, Long>{

}
