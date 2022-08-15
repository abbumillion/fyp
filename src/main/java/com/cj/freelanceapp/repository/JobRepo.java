package com.cj.freelanceapp.repository;


import com.cj.freelanceapp.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<Job, Long> {

}
