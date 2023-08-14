package edu.project.jobportal.Job_Portal.dto;



import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class JobDto {
	private long jobId;
	private String jobTitle;
	private String jobDiscription;
	private String jobCompany;
	private double jobSalary;
}
