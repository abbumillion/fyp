package com.cj.freelanceapp.ServiceImp;


import com.cj.freelanceapp.model.Skill;
import com.cj.freelanceapp.repository.SkillRepo;
import com.cj.freelanceapp.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImp implements SkillService {
    @Autowired
    private SkillRepo skillRepo;

    /**
     *
     * @param skillName
     * @return
     */
    @Override
    public Skill getSkillBySkillName(String skillName) {
        return skillRepo.findBySkillName(skillName);
    }

    @Override
    public List<Skill> getSkillsByCategory(String skillCategory) {
        return null;
    }

    /**
     *
     * @param skill
     */
    @Override
    public void add_skill(Skill skill) {
        skillRepo.save(skill);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Skill get_skill(long id) {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Skill> all_skill() {
        return skillRepo.findAll();
    }

    /**
     *
     * @param id
     */
    @Override
    public void update_skill(long id) {

    }

    /**
     *
     * @param id
     */
    @Override
    public void delete_skill(long id) {
        skillRepo.deleteById(id);
    }

    /**
     *
     */
    @Override
    public void delete_all() {
        skillRepo.deleteAll();
    }

    /**
     *
     * @param pageable
     * @return
     */
    @Override
    public Page<Skill> listSkills(Pageable pageable) {
        return skillRepo.findAll(pageable);
    }

    /**
     *
     * @param skillName
     * @param pageable
     * @return
     */
    @Override
    public Page<Skill> searchByTerm(String skillName, Pageable pageable) {
        return skillRepo.searchByTerm(skillName,pageable);
    }
}
