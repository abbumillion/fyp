package com.cj.freelanceapp.exception;

/**************************************************************************************
 * Description : Invalid Skill Exception class
 * Created Date: 22 April, 2021 
 * Version     : v1.0.0
 * AUTHOR MILLION SHARBE
 *************************************************************************************/
public class InvalidSkillException extends RuntimeException {

	private static final long serialVersionUID = -1840953501707991093L;

	public InvalidSkillException() {
		super();
	}

	public InvalidSkillException(String message) {
		super(message);
	}

}
