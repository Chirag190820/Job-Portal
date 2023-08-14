package edu.project.jobportal.Job_Portal.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectDto {
	private long projectId;
	private String projectTitle;
	private String projectDescription;
	private String projectSiteUrl;
}
