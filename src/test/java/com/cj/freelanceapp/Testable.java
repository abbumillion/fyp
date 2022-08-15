package com.cj.freelanceapp;

import com.cj.freelanceapp.ServiceImp.*;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * INTERFACE FOR TESTABLE
 * CLASSES
 */
public interface Testable {
    /**
     * INITIALIZING
     */
    void init();

    /**
     * INSERTING TEST DATA
     */
    void insertTestData();

    /**
     * RETRIEVE TEST DATA
     */
    void retrieveTestData();

    /**
     * REMOVE TEST DATA
     */
    void removeTestData();

    @Autowired
     AdminServiceImp adminServiceImp = new AdminServiceImp();
    @Autowired
     SkillServiceImp skillServiceImp = new SkillServiceImp();
    @Autowired
     UserServiceImpl userServiceImp = new UserServiceImpl();
    @Autowired
     JobServiceImp jobServiceImp = new JobServiceImp();
    @Autowired
     FeedbackServiceImp feedbackServiceImp = new FeedbackServiceImp();
    Faker faker = new Faker();
}
