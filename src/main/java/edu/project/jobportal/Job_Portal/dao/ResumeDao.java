package edu.project.jobportal.Job_Portal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.project.jobportal.Job_Portal.repository.ResumeRepo;

@Repository
public class ResumeDao {
	@Autowired
	private ResumeRepo resumeRepo;
}
