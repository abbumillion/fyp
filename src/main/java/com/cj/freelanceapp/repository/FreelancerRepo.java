package com.cj.freelanceapp.repository;

import com.cj.freelanceapp.model.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreelancerRepo extends JpaRepository<Freelancer, Long> {


}
