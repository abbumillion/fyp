package com.cj.freelanceapp.controller;

import com.cj.freelanceapp.ServiceImp.SkillServiceImp;
import com.cj.freelanceapp.dto.SkillDTO;
import com.cj.freelanceapp.exception.InvalidSkillException;
import com.cj.freelanceapp.model.Skill;
import com.cj.freelanceapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class SkillController {
    @Autowired
    private SkillServiceImp skillServiceImp;
    @Autowired
    private UserService userService;

//    @Value("${max.result.per.page}")
//    private int maxResults;
//
//    @Value("${max.card.display.on.pagination.tray}")
//    private int maxPaginationTraySize;

    @RequestMapping("/addskill")
    public String addSkill(Skill skill) {
        try {
            if (skill != null) {
                skillServiceImp.add_skill(skill);
            }
        } catch (InvalidSkillException e) {
            return e.getLocalizedMessage();
        }
        return "Skill Added successful!!";
    }

    @RequestMapping("/api/getskill")
    public String getSkill(int id) {
        return "addskill.jsp";
    }

    @RequestMapping("/api/skills")
    public List<Skill> mySkill()
    {
        return skillServiceImp.all_skill();
    }

    @GetMapping("/skills")
    public ModelAndView skills(@RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
                               @RequestParam(value = "size", defaultValue = "4", required = false) Integer size) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("skills");
        Page<Skill> allSkills = skillServiceImp.listSkills(PageRequest.of(page, size));
        modelAndView.addObject("allSkills", allSkills);
//        modelAndView.addObject("maxTraySize", size);
//        modelAndView.addObject("currentPage", page);
        return modelAndView;
    }

//    @GetMapping("/searchBox")
//    public ModelAndView searchByTerm(@RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
//                                     @RequestParam(value = "size", defaultValue = "4", required = false) Integer size,
//                                     @RequestParam(value = "searchTerm", required = false) String searchTerm) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("home");
//        Page<User> allUsers = userService.searchByTerm(searchTerm.trim(), PageRequest.of(page, size, Sort.by("fullName")));
//        modelAndView.addObject("allUsers", allUsers);
//        modelAndView.addObject("maxTraySize", size);
//        modelAndView.addObject("currentPage", page);
//        return modelAndView;
//    }
//
//    /**
//     * @return
//     */
//    @GetMapping("/search")
//    public ModelAndView search() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("search");
//        return modelAndView;
//    }
//
//    @PostMapping("/searchSubmit")
//    public ModelAndView searchSubmit(@ModelAttribute SearchDTO searchDto) {
//        List<User> result = userService.searchBy(searchDto.getSearchKeyword(), searchDto.getCriteria());
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("search");
//        modelAndView.addObject("result", result);
//        return modelAndView;
//    }


    @RequestMapping("/api/editskill")
    public String editSkill(SkillDTO skill) {
        return "editskill.jsp";
    }

    @RequestMapping("/api/deleteskill")
    public String deleteSkill(SkillDTO skill) {
        return "addskill.jsp";
    }
}
