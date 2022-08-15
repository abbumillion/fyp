package com.cj.freelanceapp.exception;

/**************************************************************************************
 * Description : Invalid Bookmarked Freelancer Exception class.
 * Created Date: 22 April, 2021 
 * Version     : v1.0.0
 * AUTHOR      : MILLION SHARBE
 *************************************************************************************/
public class InvalidBookmarkedFreelancerException extends RuntimeException {

	private static final long serialVersionUID = -397062827051951364L;

	public InvalidBookmarkedFreelancerException() {
		super();
	}

	public InvalidBookmarkedFreelancerException(String message) {
		super(message);
	}

}
