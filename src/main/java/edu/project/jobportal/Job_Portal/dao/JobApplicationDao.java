package edu.project.jobportal.Job_Portal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.project.jobportal.Job_Portal.repository.JobApplicationRepo;

@Repository
public class JobApplicationDao {

	@Autowired
	private JobApplicationRepo jobApplicationRepo;
}
