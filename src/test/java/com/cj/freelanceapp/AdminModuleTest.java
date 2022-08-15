package com.cj.freelanceapp;

import com.cj.freelanceapp.ServiceImp.AdminServiceImp;
import com.cj.freelanceapp.helpers.ROLE;
import com.cj.freelanceapp.model.Admin;
import com.cj.freelanceapp.model.User;
import com.github.javafaker.Faker;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.IntStream;

@org.junit.platform.commons.annotation.Testable
public class AdminModuleTest implements Testable{

    /**
     * ADMIN TESTING MODULE
     */
    @Autowired
    private AdminServiceImp adminServiceImp;
    Faker faker;
    @Override
    public void init() {
        /**
         * FAKER INITIALIZING
         */
        faker = new Faker();
    }

    @Override
    public void insertTestData() {
        /**
         * INSERTING DATA TO TEST
         * ADMIN MODULE
         */
        List<Admin> admins = IntStream.range(1, 1000)
                .mapToObj(e ->
                        Admin.builder()
                                /**
                                 * builder pattern
                                 */
                                .user(User.builder()
                                        .role(ROLE.ADMIN.name())
                                        .isActive(faker.bool().bool())
                                        .password(faker.code().asin())
                                        .email(faker.internet().emailAddress())
                                        .phoneNumber(faker.phoneNumber().phoneNumber())
                                        .fullName(faker.name().fullName())
                                        .build())
                                /**
                                 * recursive building
                                 */
                                .build()
                ).toList();
        admins.forEach(e ->
        {
            /**
             *
             */
            Admin admin = e;
            adminServiceImp.add_admin(admin);
        });

    }

    /**
     *
     */
    @Override
    public void retrieveTestData() {

    }

    /**
     *
     */
    @Override
    public void removeTestData() {

    }
}
