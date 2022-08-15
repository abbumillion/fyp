package com.cj.freelanceapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * DATA ANNOTATION FOR GETTER AND SETTER
 * METHODS
 */
@Data
/**
 * ALL ARGUMENT CONSTRUCTOR
 */
@AllArgsConstructor
/**
 * NO ARGUMENT CONSTRUCTOR
 */
@NoArgsConstructor
/**
 * BUILDER PATTERN
 */
@Builder
public class JobDTO {
	/**
	 * JOB DATA TRANSFER OBJECT
	 */
	/**
	 * EDUCATION LEVEL
	 */
	private String educationLevel;
	/**
	 * JOB DESCRIPTION
	 */
	private String description;
	/**
	 * JOB TYPE
	 */
	private String type;
	/**
	 * JOB SKILL
	 */
	private String skill;
	/**
	 * POSTED DATE
	 */
	private String posted = new Date().toGMTString();
	/**
	 * JOB ANNOUNCEMENT END DATE
	 */
	private String enddate;
	/**
	 * BUDGET OR SALARY
	 */
	private double budget;

}