package com.cj.freelanceapp.repository;


import com.cj.freelanceapp.model.Customer;
import com.cj.freelanceapp.model.Feedback;
import com.cj.freelanceapp.model.Job;
import com.cj.freelanceapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>
/**
 * CUSTOMER DATA ACCESS OBJECT
 * THIS INTERFACE WILL HOLD ALL
 * CUSTOMER RELATED DATA ACCESS
 * METHODS AND OPERATIONS
 * AUTHOR MILLION SHARBE
 * DATE AUG 6 , 2022
 */

{
    /**
     * FIND CUSTOMER BY USER ACCOUNT
     * @param user
     * @return
     */
    Customer findByUser(User user);

    /**
     * FIND CUSTOMER BY JOB
     *
     * @param job
     * @return
     */
    Customer findByJob(Job job);

    /**
     * GET CUSTOMER BY FEEDBACK
     *
     * @param feedback
     * @return
     */
    Customer findByFeedback(Feedback feedback);


}
