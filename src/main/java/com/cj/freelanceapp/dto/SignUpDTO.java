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
/**
 * USER REGISTRATION DATA TRANSFER OBJECT
 * AUTHOR THOMAS FASIL
 * DATE AUG 1 ,2022
 */
public class SignUpDTO {
    /**
     * FULL NAME
     */
    private String fullName;
    /**
     * PHONE NUMBER
     */
    private String phoneNumber;
    /**
     * EMAIL
     */
    private String email;
    /**
     * PASSWORD
     */
    private String password;
    /**
     * PASSWORD CONFIRMATION
     */
    private String confirmPassword;
    /**
     * USER ROLE
     */
    private String role;
    /**
     * IS ACTIVE
     */
    private boolean isActive;
}
