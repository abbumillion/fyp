package com.cj.freelanceapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
public class Admin {

	/**************************************************************************************
	 * Description : This is and admin bean.
	 * Created Date: 22 jun, 2022
	 * Version     : v1.0.0
	 * Author      : Million Sharbe
	 *************************************************************************************/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	@OneToOne
	private User user;
}
