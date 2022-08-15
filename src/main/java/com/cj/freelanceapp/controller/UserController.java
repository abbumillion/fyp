package com.cj.freelanceapp.controller;

import com.cj.freelanceapp.ServiceImp.CustomerServiceImp;
import com.cj.freelanceapp.ServiceImp.FreelancerServiceImp;
import com.cj.freelanceapp.ServiceImp.SkillServiceImp;
import com.cj.freelanceapp.constants.AppConstant;
import com.cj.freelanceapp.dto.FreelancerProfileDTO;
import com.cj.freelanceapp.dto.Response;
import com.cj.freelanceapp.dto.SearchDTO;
import com.cj.freelanceapp.dto.SignUpDTO;
import com.cj.freelanceapp.exception.EthioFreelancingApplicationException;
import com.cj.freelanceapp.helpers.EDUCATIONLEVEL;
import com.cj.freelanceapp.helpers.ROLE;
import com.cj.freelanceapp.model.Customer;
import com.cj.freelanceapp.model.Freelancer;
import com.cj.freelanceapp.model.Skill;
import com.cj.freelanceapp.model.User;
import com.cj.freelanceapp.security.SuccessfullLoginHandler;
import com.cj.freelanceapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.support.MultipartFilter;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@RestController
public class UserController
        /**
         * USER REST END POINT DEFINITION CLASS
         * MAIN USER RELATED REQUESTS ARE SENT AND
         * ACCEPTED IN THIS CLASS
         * AUTHOR THOMAS FASIL
         * DATE JUN 21 , 2022
         */
{
    /**
     * USER SERVICE OBJECT INJECTION
     */
    @Autowired
    private UserService userService;
    /**
     * SUCCESSFULL LOGIN HANDLER INJECTION
     */
    @Autowired
    SuccessfullLoginHandler successfullLoginHandler;
    /**
     * CUSTOMER SERVICE INJECTION
     */
    @Autowired
    CustomerServiceImp customerServiceImp;
    /**
     * FREELANCER SERVICE INJECTION
     */
    @Autowired
    FreelancerServiceImp freelancerServiceImp;
    @Autowired
    private SkillServiceImp skillServiceImp;

    /**
     * USER DATA HOLDER
     */
    private User user;
    /**
     * MAX PAGE RESULT
     */
    @Value("${max.result.per.page}")
    private int maxResults;
    /**
     * MAX PAGINATION SIZE
     */
    @Value("${max.card.display.on.pagination.tray}")
    private int maxPaginationTraySize;

    /**
     * @return INDEX PAGE
     */
    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    /**
     * @param page
     * @param size
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/home")
    public ModelAndView home(@RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
                             @RequestParam(value = "size", defaultValue = "4", required = false) Integer size,
                             HttpServletRequest request, HttpServletResponse response) {

        Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>)
                SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        List<String> list = new ArrayList<>();
        authorities.forEach(e -> {
            list.add(e.getAuthority());
        });

        ModelAndView modelAndView = new ModelAndView();
        if (list.contains(ROLE.ADMIN.name())) {
            modelAndView.setViewName("home");
            Page<User> allUsers = userService.listUsers(PageRequest.of(page, size, Sort.by("fullName")));
            modelAndView.addObject("allUsers", allUsers);
            modelAndView.addObject("maxTraySize", size);
            modelAndView.addObject("currentPage", page);
        } else {
            modelAndView.setViewName("user-home");
            User user = userService.findUserByEmail(request.getUserPrincipal().getName());
            modelAndView.addObject("currentUser", user);
        }

        return modelAndView;
    }

    /**
     * @param page
     * @param size
     * @param searchTerm
     * @return
     */
    @GetMapping("/searchBox")
    public ModelAndView searchByTerm(@RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
                                     @RequestParam(value = "size", defaultValue = "4", required = false) Integer size,
                                     @RequestParam(value = "searchTerm", required = false) String searchTerm) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        Page<User> allUsers = userService.searchByTerm(searchTerm.trim(), PageRequest.of(page, size, Sort.by("fullName")));
        modelAndView.addObject("allUsers", allUsers);
        modelAndView.addObject("maxTraySize", size);
        modelAndView.addObject("currentPage", page);
        return modelAndView;
    }

    /**
     * @return
     */
    @GetMapping("/search")
    public ModelAndView search() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("search");
        return modelAndView;
    }

    /**
     * @param searchDto
     * @return
     */
    @PostMapping("/searchSubmit")
    public ModelAndView searchSubmit(@ModelAttribute SearchDTO searchDto) {
        List<User> result = userService.searchBy(searchDto.getSearchKeyword(), searchDto.getCriteria());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("search");
        modelAndView.addObject("result", result);
        return modelAndView;
    }

    /**
     * @return
     */
    @GetMapping("/addNewUser")
    public ModelAndView addNewUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("create-user");
        return modelAndView;
    }

    @ResponseBody
    @PostMapping("/save")
    public Response update(@RequestBody User user) {
        User dbUser = userService.findById(user.getId());
        dbUser.setFullName(user.getFullName());
        userService.saveUser(dbUser);
        return new Response(302, AppConstant.SUCCESS, "/");
    }

    /**
     * @param signUpDTO
     * @return
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public ModelAndView register(@ModelAttribute SignUpDTO signUpDTO, MultipartFilter multipartFilter) {
        /**
         * model and view object
         */
        ModelAndView modelAndView = new ModelAndView();
        /**
         * redirecting string
         */
        String result = "redirect:/";
        User dbUser = userService.findUserByEmail(signUpDTO.getEmail());
        if (signUpDTO.getFullName() == null || signUpDTO.getFullName().trim().isEmpty()) {
            result = "redirect:/addNewUser?error=Enter valid fist name";
        } else if (signUpDTO.getPhoneNumber() == null || signUpDTO.getPhoneNumber().trim().isEmpty()) {
            result = "redirect:/addNewUser?error=Enter valid last name";
        } else if (signUpDTO.getEmail() == null || signUpDTO.getEmail().trim().isEmpty()) {
            result = "redirect:/addNewUser?error=Enter valid email";
        } else if (signUpDTO.getPassword() == null || signUpDTO.getPassword().trim().isEmpty()) {
            result = "redirect:/addNewUser?error=Enter valid password";
        } else if (signUpDTO.getPassword().equals(signUpDTO.getConfirmPassword())) {
            result = "redirect:/addNewUser?error=Password mis-match";
        } else if (StringUtils.isEmpty(signUpDTO.getRole())) {
            result = "redirect:/addNewUser?error=Select a valid Role";
        }
        if (dbUser == null) {
            User user = User.builder()
                    .fullName(signUpDTO.getFullName())
                    .email(signUpDTO.getEmail())
                    .isActive(signUpDTO.isActive())
                    .password(signUpDTO.getPassword())
                    .role(signUpDTO.getRole())
                    .phoneNumber(signUpDTO.getPhoneNumber())
                    .build();

            /**
             * CHECK USER ROLE IF IT'S CUSTOMER JUST
             * SAVE THE USER AND CUSTOMER TO DATABASE
             * ELSE IF USER ROLE IS FREELANCER REDIRECT IT
             * TO CREATE UR PROFILE PAGE TO SET UP HIS
             * PROFILE
             */
            if (user.getRole().equalsIgnoreCase("CUSTOMER")) {
                /**
                 * CUSTOMER ROLE
                 */
                userService.saveUser(user);
                Customer customer =
                        Customer.
                                builder()
                                .user(user)
                                .build();
                customerServiceImp.add_customer(customer);
                modelAndView.setViewName("login");
            } else if (user.getRole().equalsIgnoreCase("FREELANCER")) {
                /**
                 * FREELANCER ROLE
                 */
                this.user = user;
                List els = List.of(EDUCATIONLEVEL.values());
                List<Skill> skills = skillServiceImp.all_skill();
                modelAndView.addObject("skills", skills);
                modelAndView.addObject("els", els);
                modelAndView.setViewName("freelancerregistration");
            }
        } else {
            throw new EthioFreelancingApplicationException();
        }
        return modelAndView;
    }

    /**
     * FREELANCER REGISTRATION PAGE
     * @return LOGIN PAGE
     */
    @RequestMapping("/freelancerregistration")
    public ModelAndView freelancerRegistration(FreelancerProfileDTO freelancerProfileDTO) {
        Skill skill = skillServiceImp.getSkillBySkillName(freelancerProfileDTO.getSkill());
        Freelancer freelancer = Freelancer
                .builder()
                .availability(freelancerProfileDTO.getAvailability())
                .bio(freelancerProfileDTO.getBio())
                .educationLevel(freelancerProfileDTO.getEducationLevel())
                .skill(skill)
                .user(user)
                .build();
        userService.saveUser(user);
        freelancerServiceImp.add_freelancer(freelancer);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return  modelAndView;
    }


    /**
     * @param userId
     * @return
     */
    @GetMapping("/delete/{userId}")
    public String delete(@PathVariable Long userId) {
        userService.removeById(userId);
        return "redirect:/";
    }

    /**
     * @return
     */
    @ResponseBody
    @GetMapping("/removeAll")
    public Boolean removeAll() {
        return userService.removeAll();
    }

    /**
     * @return
     */
    @GetMapping("/403")
    public ModelAndView accessDenied() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("403");
        return modelAndView;
    }

    /**
     * @return
     */
    @GetMapping("/error")
    public ModelAndView error() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        return modelAndView;
    }

    @RequestMapping("/profile")
    public ModelAndView profile() {
        ModelAndView modelAndView = new ModelAndView("profile");
        System.out.println(successfullLoginHandler.getUser());
        modelAndView.addObject("user", successfullLoginHandler.getUser());
        return modelAndView;
    }

    /**
     * @return
     */
    @GetMapping("/about")
    public ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("about");
        return modelAndView;
    }

}
