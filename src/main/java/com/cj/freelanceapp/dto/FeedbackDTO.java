package com.cj.freelanceapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**************************************************************************************
 * @author       yordanos
 * Description : This is the DTO class for Feedback module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
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
public class FeedbackDTO {
	/**
	 * FEEDBACK CONTENT
	 */
	private String content;
	/**
	 * FEEDBACK DATE
	 */
	private String date;


}
