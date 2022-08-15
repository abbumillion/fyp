package com.cj.freelanceapp.exception;
/**************************************************************************************
 * Author Million Sharbe
 * Description : Bookmarked Freelancer Validation class.
 * Created Date: 22 jun, 2022
 * Version     : v1.0.0
 *************************************************************************************/
public class InvalidAdminException extends RuntimeException {

	private static final long serialVersionUID = -1441549585631024871L;

	public InvalidAdminException() {
		super();
	}

	public InvalidAdminException(String message) {
		super(message);
	}

}
