package edu.project.jobportal.Job_Portal.dto;

import java.time.LocalDateTime;
import java.util.List;

import edu.project.jobportal.Job_Portal.entity.Employer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobResponse {
	private long jobId;
	private String jobTitle;
	private String jobDiscription;
	private String company;
	private double salary;
	private LocalDateTime jobCreateDatetime;

	private List<String> skills;
	
	private Employer employer;
}
