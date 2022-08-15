package com.cj.freelanceapp.service;


import com.cj.freelanceapp.model.Freelancer;
import com.cj.freelanceapp.model.Skill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FreelancerService {
    /**
     *
     * @param freelancer
     */
    void add_freelancer(Freelancer freelancer);

    /**
     *
     * @param id
     * @return
     */
    Freelancer get_freelancer(long id);

    /**
     *
     * @return
     */
    List<Freelancer> all_freelancer();

    /**
     *
     * @param id
     */
    void update_freelancer(long id);

    /**
     *
     * @param id
     */
    void delete_freelancer(long id);

    /**
     *
     */
    void delete_all();

    /**
     * GET ALL Freelancer BY PAGE
     * @param pageable
     * @return
     */
    Page<Freelancer> listFreelancers(Pageable pageable);

    /**
     * SEARCH Freelancer
     * @param fullName
     * @param pageable
     * @return
     */
    Page<Freelancer> searchByTerm(String fullName, Pageable pageable);
}
