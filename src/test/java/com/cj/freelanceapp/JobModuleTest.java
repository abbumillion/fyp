package com.cj.freelanceapp;

import com.cj.freelanceapp.model.Admin;

import java.util.List;
import java.util.stream.IntStream;

public class JobModuleTest implements Testable{
    @Override
    public void init() {
        List<Admin> users = (List<Admin>) IntStream.range(1, 100)
                .mapToObj(e ->
                        Admin.builder()
                                .build()
                ).toList();
        users.forEach(e ->
        {
            Admin u = (Admin) e;
//            adminServiceImp.
        });
    }

    @Override
    public void insertTestData() {

    }

    @Override
    public void retrieveTestData() {

    }

    @Override
    public void removeTestData() {

    }
}
