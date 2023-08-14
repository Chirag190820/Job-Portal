package edu.project.jobportal.Job_Portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import edu.project.jobportal.Job_Portal.dao.EmployerDao;
import edu.project.jobportal.Job_Portal.entity.Employer;
import edu.project.jobportal.Job_Portal.util.responseStructure;
@Service
public class EmployerService {
	
	@Autowired
	private EmployerDao employerDao;

	public ResponseEntity<responseStructure<Employer>> addEmployer(Employer employer) {
		
		Employer employer2 = employerDao.addEmployer(employer);
		
		
		responseStructure<Employer> responseStructure = new responseStructure<>();
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMessage("Employer Added Successfully!!");
		responseStructure.setData(employer2);
		return  new ResponseEntity<responseStructure<Employer>>(responseStructure,HttpStatus.CREATED);
	}

}
