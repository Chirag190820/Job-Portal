package edu.project.jobportal.Job_Portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.project.jobportal.Job_Portal.dto.ApplicantDto;
import edu.project.jobportal.Job_Portal.dto.ApplicantResponse;
import edu.project.jobportal.Job_Portal.entity.Applicant;
import edu.project.jobportal.Job_Portal.service.ApplicantService;
import edu.project.jobportal.Job_Portal.util.responseStructure;



@RestController
@RequestMapping("/applicant")
public class ApplicantController {
	
	@Autowired
	private ApplicantService  applicantService;
	
	@PostMapping
	public ResponseEntity<responseStructure<ApplicantDto>> saveApplicant(@RequestBody Applicant applicant){
		return applicantService.saveApplicant(applicant);
	}
	
	@GetMapping
	public ResponseEntity<responseStructure<ApplicantDto>> getApplicantById(@RequestParam int applicantId){
		return applicantService.getApplicantById(applicantId);
	}
	
	@PutMapping
	public ResponseEntity<responseStructure<ApplicantDto>> updateApplicant(@RequestParam int applicantId, @RequestBody Applicant applicant){
		return applicantService.updateApplicant(applicantId, applicant);
	}
	
	@DeleteMapping
	public ResponseEntity<responseStructure<ApplicantDto>> deleteApplicantById(@RequestParam int applicantId){
		return applicantService.deleteApplicant(applicantId);
	}
	
	@GetMapping("/skill")
	public ResponseEntity<responseStructure<List<ApplicantResponse>>> getApplicantBySkill(
			@RequestParam String skill){
		return applicantService.getApplicantBySkill(skill);
	}

}