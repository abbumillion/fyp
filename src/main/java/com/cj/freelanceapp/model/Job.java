package com.cj.freelanceapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
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
public class Job
/**
 * JOB BEAN DATABASE TABLE DEFINITION
 * CLASS
 */

{
	/**
	 * ID
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long jobId;
	/**
	 * VACANCY
	 */
	@Column(nullable = false, unique = false, length = 100)
	private String educationLevel;
	/**
	 * JOB DESCRIPTION
	 */
    @Column(nullable = false, unique = false, length = 500)
    private String description;
	/**
	 * JOB TYPE
	 */
	@Column(nullable = false, unique = false, length = 20)
    private String type;
	/**
	 * POSTED ON DATE
	 */
    @Column(nullable = false, unique = false, length = 50)
    private String posted;
	/**
	 * END DATE
	 */
	@Column(nullable = false, unique = false, length = 50)
    private String endDate;
	/**
	 * JOB BUDGET
	 */
    @Column(nullable = false, unique = false, length = 20)
    private double budget;
	/**
	 * SKILL REQUIRED BY JOB
	 */
	@OneToOne
    private Skill skill;
	/**
	 * JOB APPLICATION RELATED TO THIS JOB
	 */
    @OneToMany
    private List<JobApplication> jobApplication;
	/**
	 * CUSTOMER WHO POSTED THE JOB
	 */
	@OneToOne
    private Customer customer;
}
