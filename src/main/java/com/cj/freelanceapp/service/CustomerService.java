package com.cj.freelanceapp.service;


import com.cj.freelanceapp.model.Customer;
import com.cj.freelanceapp.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {

    /**
     * FIND CUSTOMER BY USER ID
     */

    Customer findCustomerByUser(User user);

    /**
     * ADD SKILL TO DATABASE
     *
     * @param customerModel
     */
    void add_customer(Customer customerModel);

    /**
     * GET CUSTOMER BY ID
     *
     * @param id
     * @return
     */
    Customer get_customer(long id);

    /**
     * GET ALL CUSTOMERS
     *
     * @return
     */
    List<Customer> all_customer();

    /**
     * GET ALL CUSTOMER BY PAGE
     *
     * @param pageable
     * @return
     */
    Page<Customer> allCustomer(Pageable pageable);

    /**
     * UPDATE CUSTOMER WITH ID
     *
     * @param id
     */
    void update_customer(long id);

    /**
     * DELETE CUSTOMER BY ID
     *
     * @param id
     */
    void delete_customer(long id);

    /**
     * DELETE ALL CUSTOMERS
     */
    void delete_all();
}
