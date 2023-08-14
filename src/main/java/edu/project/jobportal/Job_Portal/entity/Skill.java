package edu.project.jobportal.Job_Portal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long skillId;
	private String skillName;
}
