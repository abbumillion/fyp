package com.cj.freelanceapp.ServiceImp;

import com.cj.freelanceapp.model.Freelancer;
import com.cj.freelanceapp.repository.FreelancerRepo;
import com.cj.freelanceapp.service.FreelancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreelancerServiceImp implements FreelancerService
/**
 * FREELANCER SERVICE IMPLEMENTATION CLASS
 * WITH ALL FREELANCER RELATED METHODS AND
 * OPERATIONS
 * AUTHOR MILLION SHARBE
 * DATE AUG 16 , 2022
 */

{
    /**
     * FREELANCER REPOSITORY OBJECT INJECTION
     */
    @Autowired
    private FreelancerRepo freelancerRepo;
    /**
     * @param freelancer
     */
    @Override
    public void add_freelancer(Freelancer freelancer) {
        /**
         * ADD FREELANCER TO DATABASE
         */
        freelancerRepo.save(freelancer);
    }
    /**
     * @param id
     * @return
     */
    @Override
    public Freelancer get_freelancer(long id) {
        /**
         * GET FREELANCER BY ID
         */
        return freelancerRepo.getReferenceById(id);
    }

    /**
     * @return
     */
    @Override
    public List<Freelancer> all_freelancer() {
        return freelancerRepo.findAll();
    }

    /**
     * @param id
     */
    @Override
    public void update_freelancer(long id) {


    }

    /**
     * @param id
     */
    @Override
    public void delete_freelancer(long id) {
        freelancerRepo.deleteById(id);
    }

    /**
     *
     */
    @Override
    public void delete_all() {
        freelancerRepo.deleteAll();
    }

    @Override
    public Page<Freelancer> listFreelancers(Pageable pageable) {
        return freelancerRepo.findAll(pageable);
    }

    @Override
    public Page<Freelancer> searchByTerm(String fullName, Pageable pageable) {
        return null;
    }
}
