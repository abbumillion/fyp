package com.cj.freelanceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FreelanceappApplication  extends SpringBootServletInitializer
/**************************************************************************************
 * ETHIO-FREELANCING APPLICATION
 * AUTHORS
 * MILLION SHARBE SPRING SECURITY , JAVAFX , JAVA DEVELOPER
 * THOMAS FASIL SPRING JPA , CSS AND HTML
 * YORDANOS DAMTEW DESIGNER ARCHITECT DATABASE DESIGNER
 * Created Date: 22 jun, 2022
 * Version     : v1.0.0
 *************************************************************************************/

{

		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			return application.sources(FreelanceappApplication.class);
		}
	/**
	 * STARTING POINT OF THE APPLICATION
	 * @param args
	 */
		public static void main(String[] args) {
			SpringApplication.run(FreelanceappApplication.class, args);
		}
	}
