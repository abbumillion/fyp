package com.cj.freelanceapp.repository;


import com.cj.freelanceapp.model.Skill;
import com.cj.freelanceapp.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface SkillRepo extends JpaRepository<Skill, Long> {

    @Query("SELECT t FROM Skill t WHERE " +
            "LOWER(t.skillName) LIKE LOWER(CONCAT('%',:searchTerm, '%'))")
    Page<Skill> searchByTerm(@Param("searchTerm") String searchTerm, Pageable pageable);

    /**
     * FIND SKILL BY SKILL NAME FROM
     * DATABASE RECORDS
     * @param skillName
     * @return
     */
    Skill findBySkillName(String skillName);



}
