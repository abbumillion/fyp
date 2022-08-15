package com.cj.freelanceapp.controller;


import com.cj.freelanceapp.ServiceImp.*;
import com.cj.freelanceapp.dto.AdminDTO;
import com.cj.freelanceapp.dto.UserDTO;
import com.cj.freelanceapp.exception.InvalidAdminException;
import com.cj.freelanceapp.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author million sharbe
 * Description: This class is used as the controller for the Admin module
 * Created Date: 18 April, 2022
 * Version : v1.0.0
 */
@RestController
@CrossOrigin(origins = "*")
public class AdminController {
    /**
     * ADMIN SERVICE IMPLEMENTATION INJECTION
     */
    @Autowired
    AdminServiceImp adminService;
    /**
     * FREELANCER SERVICE IMPLEMENTATION INJECTION
     */
    @Autowired
    FreelancerServiceImp freelancerServiceImp;
    /**
     * CUSTOMER SERVICE IMPLEMENTATION INJECTION
     */
    @Autowired
    CustomerServiceImp customerServiceImp;
    /**
     * JOB SERVICE IMPLEMENTATION INJECTION
     */
    @Autowired
    JobServiceImp jobServiceImp;
    /**
     * JOB APPLICATION IMPLEMENTATION INJECTION
     */
    @Autowired
    JobApplicationServiceImp jobApplicationServiceImp;
    /**
     * @param id,admin
     * @return Response Entity of Object type
     * Description : This method Updates the entry in Admin.
     * @PutMapping: Handles HTTP Put Requests
     */
    /**
     * UPDATE ADMIN RECORD WITH THIS ID
     * @param id
     * @param adminDto
     * @return
     */
    @PutMapping("/update/{id}")
    public ResponseEntity<Object> adminUpdate(@PathVariable Long id, @RequestBody AdminDTO adminDto) {

        try {

            Admin admin = Admin.builder().build();
            adminService.update_admin(id, admin);
            return new ResponseEntity<>("Admin Successfully", HttpStatus.ACCEPTED);

        } catch (InvalidAdminException exception) {
            throw new InvalidAdminException("Admin with given id not found");
        }
    }

    /**
     * @param id
     * @return Response Entity of type Admin
     * Description : This method finds Admin by id
     * @GetMapping: Annotation for mapping HTTP GET requests onto specific handler methods.
     */

    @GetMapping(value = "api/find/id")
    public Admin findById(@PathVariable Long id) {
        try {
            return adminService.get_admin(id);
        } catch (InvalidAdminException exception) {
            throw new InvalidAdminException("Admin with this id not found");
        }
    }

    /**
     * @param userName
     * @return Response Entity of type Admin
     * Description: This method finds Admin by userName
     * @GetMapping: Annotation for mapping HTTP GET requests onto specific handler methods.
     */

    @RequestMapping(value = "/api/findAll")
    public List<AdminDTO> findAll() {
        try {
            /**
             * GET ALL ADMIN RECORDS FROM DATABASE
             */
            List<Admin> admins = adminService.all_admin();
            /**
             * CREATE NEW LIST TO HOLD ADMIN DATA TRANSFER OBJECTS
             */
            List<AdminDTO> adminDTOS = new ArrayList<>();
            /**
             * ITERATE THROUGH THE LIST AND CONVERT THE ADMIN RECORD TO
             * ADMIN DATA TRANSFER OBJECTS
             */
            for (Admin admin : admins) {
                /**
                 * ADMIN DATA TRANSFER OBJECT BUILDER PATTERN
                 */
                AdminDTO adminDTO = AdminDTO.builder()
                        .Id(admin.getId())
                        .user(
								/**
								 * BUILDER PATTERNS
								 * FOR CREATING
								 */
								UserDTO.builder()
                                        /**
                                         * GET ID
                                         */
                                        .id(admin.getUser().getId())
                                        /**
                                         * GET USER NAME
                                         */
                                        .fullName(admin.getUser().getFullName())
                                        /**
                                         * GET EMAIL
                                         */
                                        .email(admin.getUser().getEmail())
                                        /**
                                         * GET IS ACTIVE
                                         */
                                        .isActive(admin.getUser().isActive())
                                        /**
                                         * GET PASSWORD
                                         */
                                        .password(admin.getUser().getPassword())
                                        /**
                                         * GET PHONE NUMBER
                                         */
                                        .phoneNumber(admin.getUser().getPhoneNumber())
                                        /**
                                         * GET RATING
                                         */
//                                        .rating(admin.getUser().getRating())
                                        /**
                                         * GET ROLE WHICH IS OBVIOUSLY ADMIN
                                         */
                                        .role(admin.getUser().getRole())
                                        /**
                                         * FIRST BUILD THE USER DATA TRANSFER OBJECT THEN
                                         * ASSIGN TO ADMIN DATA TRANSFER OBJECT
                                         */
                                        .build()
                        )
                        .build();
				/**
				 * ADDING ADMIN DTO TO ADMIN DATA TRANSFER LIST
				 */
				adminDTOS.add(adminDTO);
            }
            return adminDTOS;
        } catch (InvalidAdminException exception) {
            /**
             * THROW NEW ADMIN NOT FOUND EXCEPTION
             */
            throw new InvalidAdminException("Admin  not found");
        }
    }

}