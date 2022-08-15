package com.cj.freelanceapp.service;


import com.cj.freelanceapp.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    /**
     * FIND USER BY FULL NAME
     * @param fullName
     * @return
     */
    User findUserByFullName(String fullName);

    /**
     * FIND USER BY PHONE NUMBER
     * @param phoneNumber
     * @return
     */
    User findUserByPhonenumber(String phoneNumber);

    /**
     * FIND USER BY REGISTRATION DATE
     * @param date
     * @return
     */
    List<User> findUserByRegistrationOn(String date);

    /**
     * FIND USER BY EMAIL
     * @param email
     * @return
     */
    User findUserByEmail(String email);

    /**
     * SAVE USER TO DATABASE
     * @param user
     */
    void saveUser(User user);

    /**
     * REMOVE ALL USERS
     * @return
     */
    Boolean removeAll();

    /**
     * REMOVE USER BY ID
     * @param id
     */
    void removeById(Long id);

    /**
     * FIND USER FIND BY ID
     * @param id
     * @return
     */
    User findById(Long id);

    /**
     * SEARCH USER BY SEARCHING TERM
     * @param fullName
     * @param pageable
     * @return
     */
    Page<User> searchByTerm(String fullName, Pageable pageable);

    /**
     * LIST ALL USERS BY PAGE
     * @param pageable
     * @return
     */
    Page<User> listUsers(Pageable pageable);

    /**
     * SEARCH USER BY SEARCHING CRITERIA
     * @param keyword
     * @param criteria
     * @return
     */
    List<User> searchBy(String keyword, String criteria);
}
