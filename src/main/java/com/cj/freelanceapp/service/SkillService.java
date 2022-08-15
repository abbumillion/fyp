package com.cj.freelanceapp.service;


import com.cj.freelanceapp.model.Skill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Skill Services definition
 * interface this class will contain all
 * services operation that are required by
 * skill service module
 * Author Million Sharbe
 * Date Aug 1,2022
 */
public interface SkillService {
    /**
     *
     * @return
     */
    Skill getSkillBySkillName(String skillName);

    /**
     * GET SKILLS BY CATEGORY
     * @param skillCategory
     * @return
     */
    List<Skill> getSkillsByCategory(String skillCategory);
    /**
     * ADD SKILL TO DATABASE
     * @param skill
     */
    void add_skill(Skill skill);

    /**
     * GET SKILL BY ID
     * @param id
     * @return
     */
    Skill get_skill(long id);

    /**
     * GET ALL SKILLS
     * @return
     */
    List<Skill> all_skill();

    /**
     * UPDATE SKILL BY ID
     * @param id
     */
    void update_skill(long id);

    /**
     * DELETE SKILL
     * @param id
     */
    void delete_skill(long id);

    /**
     * DELETE ALL SKILLS
     */
    void delete_all();

    /**
     * GET ALL SKILLS BY PAGE
     * @param pageable
     * @return
     */
    Page<Skill> listSkills(Pageable pageable);

    /**
     * SEARCH SKILL
     * @param skillName
     * @param pageable
     * @return
     */
    Page<Skill> searchByTerm(String skillName, Pageable pageable);

}
