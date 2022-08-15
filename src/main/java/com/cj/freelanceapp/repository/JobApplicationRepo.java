package com.cj.freelanceapp.repository;


import com.cj.freelanceapp.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobApplicationRepo extends JpaRepository<JobApplication, Long> {

}
