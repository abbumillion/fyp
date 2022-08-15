package com.cj.freelanceapp;

import com.cj.freelanceapp.model.Skill;

import java.util.List;
import java.util.stream.IntStream;

public class JobApplicationModuleTest implements Testable{
    @Override
    public void init() {

    }

    @Override
    public void insertTestData() {
        List<Skill> users = (List<Skill>) IntStream.range(1, 100)
                .mapToObj(e ->
                                Skill.builder()
//                                .feedbackDate(faker.date().birthday())
//                                .feedbackContent(faker.company().buzzword())
//                                .email(faker.internet().emailAddress())
//                                .password(faker.code().asin())
//                                .isActive(faker.bool().bool())
//                                .role(CUSTOMER.name())
//                                .rating(faker.number().numberBetween(1,10))
//                                        .skillDescription(faker.company().catchPhrase())
//                                        .skillCategory(faker.company().industry())
//                                        .skillName(faker.company().profession())
                                        .build()
                ).toList();
        users.forEach(e ->
        {
            Skill u = (Skill) e;
//            skillServiceImp.add_skill(u);
        });
    }

    @Override
    public void retrieveTestData() {

    }

    @Override
    public void removeTestData() {

    }
}
