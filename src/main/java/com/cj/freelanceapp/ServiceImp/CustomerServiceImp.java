package com.cj.freelanceapp.ServiceImp;

import com.cj.freelanceapp.exception.InvalidCustomerException;
import com.cj.freelanceapp.model.Customer;
import com.cj.freelanceapp.model.User;
import com.cj.freelanceapp.repository.CustomerRepo;
import com.cj.freelanceapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {
    /**
     * customer service module
     */
    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public Customer findCustomerByUser(User user) {
        /**
         * FIND CUSTOMER BY USER ID
         */
        try {
            return customerRepo.findByUser(user);
        } catch (InvalidCustomerException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        return null;
    }

    @Override
    public void add_customer(Customer customerModel) {
        customerRepo.save(customerModel);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Customer get_customer(long id) {
        return customerRepo.getReferenceById(id);
    }

    /**
     * @return
     */

    @Override
    public List<Customer> all_customer() {
        return customerRepo.findAll();
    }

    /**
     * @param pageable
     * @return
     */
    @Override
    public Page<Customer> allCustomer(Pageable pageable) {
        return customerRepo.findAll(pageable);
    }

    /**
     * @param id updating customer
     */
    @Override
    public void update_customer(long id) {
    }

    /**
     * @param id deleting customer by id
     */
    @Override
    public void delete_customer(long id) {
        customerRepo.deleteById(id);
    }

    /**
     * deleting all customer
     */
    @Override
    public void delete_all() {
        customerRepo.deleteAll();
    }
}
