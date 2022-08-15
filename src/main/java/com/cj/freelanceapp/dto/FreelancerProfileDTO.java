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
 * FREELANCER PROFILE DATA TRANSFER OBJECT
 * AUTHOR THOMAS FASIL
 * DATE JUL 24 ,2022
 */
public class FreelancerProfileDTO {

    private String skill;
    private String availability;
    private String bio;
    private String educationLevel;

}
