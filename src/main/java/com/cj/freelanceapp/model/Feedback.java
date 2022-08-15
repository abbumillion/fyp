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
public class Feedback {
	/**
	 * ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	/**
	 * FEED BACK CONTENT
	 */
	@Column(nullable = false, unique = false, length = 500)
	private String feedbackContent;
	/**
	 * FEEDBACK DATE
	 */
	@Column(nullable = true, unique = false, length = 30)
	private Date feedbackDate;
	/**
	 * USER WHO SENT THE FEED BACK
	 */
	@ManyToOne
	private User user;



}
