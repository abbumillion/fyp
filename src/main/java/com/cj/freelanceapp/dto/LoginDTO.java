package com.cj.freelanceapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class LoginDTO
/**
 * LOGIN DATA TRANSFER OBJECT
 * AUTHOR YORDANOS DAMTEW
 * DATE AUG 5 ,2022
 */
{
	/**
	 * USER EMAIL
	 */
	private String email;
	/**
	 * PASSWORD
	 */
	private String password;
}
