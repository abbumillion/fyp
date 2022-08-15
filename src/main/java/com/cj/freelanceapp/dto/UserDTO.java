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
public class UserDTO {
    /**
     * ID
     */
    private Long id;
    /**
     * FULL NAME
     */
    private String fullName;
    /**
     * PHONE NUMBER
     */
    private String phoneNumber;
    /**
     * EMAIL ADDRESS
     */
    private String email;
    /**
     * PASSWORD
     */
    private String password;
    /**
     * ROLE
     */
    private String role;
    /**
     * IS ACTIVE
     */
    private boolean isActive;
    /**
     * RATING
     */
    private int rating;

}
