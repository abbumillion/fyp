package com.cj.freelanceapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * CLASS ANNOTATION
 */
@Entity
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
public class Skill
/**
 * SKILL BEAN DATABASE TABLE DEFINITION
 */
{
    /**
     * ID PRIMARY KEY
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    /**
     * SKILL NAME
     */
    @Column(nullable = false, length = 500)
    private String skillName;
    /**
     * SKILL DESCRIPTION COLUMN
     */
    @Column(nullable = false, length = 500)
    private String skillDescription;
    /**
     * SKILL CATEGORY COLUMN
     */
    @Column(nullable = false, length = 500)
    private String skillCategory;
}
