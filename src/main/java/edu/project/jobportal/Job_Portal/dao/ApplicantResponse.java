package edu.project.jobportal.Job_Portal.dto;


import edu.project.jobportal.Job_Portal.entity.Resume;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ApplicantResponse {
	private long applicantId;
	private String applicantName;
	private String applicantEmail;
	private long applicantPhNo;

	private Resume resume;
}
