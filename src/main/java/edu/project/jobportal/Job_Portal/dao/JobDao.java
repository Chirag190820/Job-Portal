package edu.project.jobportal.Job_Portal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.project.jobportal.Job_Portal.entity.Job;
import edu.project.jobportal.Job_Portal.repository.JobRepo;

@Repository
public class JobDao {

	@Autowired
	private JobRepo jobRepo;
	
	public Job addJob(Job job) {
		return jobRepo.save(job);
	}
}
