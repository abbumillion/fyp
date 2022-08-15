package com.cj.freelanceapp.dto;


import com.cj.freelanceapp.model.Job;
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
/**
 * JOB APPLICATION TRANSFER OBJECT
 * AUTHOR MILLION SHARBE
 */
public class JobApplicationDTO {
	/**
	 * ID
	 */
	private Long id;
	/**
	 * COVER LATTER
	 */
	private String coverLetter;
	/**
	 * FREELANCER APPLIED FOR THE JOB
	 */
	private Long freelancerId;
	/**
	 * JOB THE FREELANCER APPIED FOR
	 */
	private Job job;
	/**
	 * APPLICATION DATE
	 */
	private String applicationDate = new Date().toGMTString();
}
