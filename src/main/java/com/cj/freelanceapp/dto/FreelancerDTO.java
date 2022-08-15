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
public class FreelancerDTO {
    /**
     * ID
     */
    private long Id;
    /**
     * USER DATA TRANSFER OBJECT
     */
    private UserDTO user;
    /**
     * FREELANCER PROFILE DATA TRANSFER OBJECT
     */
    private FreelancerProfileDTO freelancerProfileDTO;

}
