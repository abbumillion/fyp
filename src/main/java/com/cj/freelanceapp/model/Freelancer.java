package com.cj.freelanceapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * CLASS ANNOTATION
 */
@Entity
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
public class Freelancer {
	/**
	 * ID PRIMARY KEY
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	/**
	 * LIST OF JOB APPLICATIONS MADE BY THIS FREELANCER
	 */
	@OneToMany
	private List<JobApplication> jobApplication;
	/**
	 * FREELANCER SKILL
	 */
	@OneToOne
	private Skill skill;
	@OneToOne
	private User user;
	/**
	 * LIST OF FEEDBACK MADE BY THIS
	 * FREELANCER
	 */
	@OneToMany
	private List<Feedback> feedback;
	/**
	 * FREELANCER RATING
	 */
	@Column(length = 2)
	private int rating;
	/**
	 * AVAILABILITY
	 */
	@Column(length = 50)
	private String availability;
	/**
	 * BIO
	 */
	@Column(length = 500)
	private String bio;
	/**
	 * EDUCATION LEVEL
	 */
	@Column(length = 50)
	private String educationLevel;
	/**
	 * resume
	 */
	@Column(length = 100)
	private String cv;


}
