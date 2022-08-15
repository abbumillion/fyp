package com.cj.freelanceapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**************************************************************************************
 * Author Thomas Fasil
 * Description : This is the DTO class for Skill module.
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
/**
 * THIS CLASS WILL HOLD ALL SKILL DATA
 * WITH BOILER PLATE SETTERS AND GETTERS
 */
public class SkillDTO {
	/**
	 * id
	 */
	private String id;
	/**
	 * skill name
	 */
	private String skillName;
	/**
	 * skill category
	 */
	private String skillCategory;
	/**
	 * skill description
	 */
	private String skillDescription;
}
