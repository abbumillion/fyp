package com.cj.freelanceapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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
public class JobApplication
/**
 * JOB APPLICATION BEAN TABLE DEFINITION
 * CLASS WITH DATA COLUMNS
 * AUTHOR YORDANOS DAMTEW
 * DATE AUG 8 , 2022
 */
{
	/**
	 * ID
	 * PRIMARY KEY
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	/**
	 * APPLICATION DATE
	 */
	@Column(nullable = false, unique = false, length = 30)
	private String applicationDate;
	/**
	 * JOB APPLICATION STATUS ACCEPTED/REJECTED
	 */
	@Column( length = 20)
	private String status;
	/**
	 * COVER LETTER FOR JOB APPLICATION
	 *
	 */
	@Column(nullable = true, unique = false, length = 100)
	private String  coverLetter;
	/**
	 * JOB RELATED TO THIS JOB APPLICATION
	 */
	@ManyToOne
	private Job job;

}
