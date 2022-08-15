package com.cj.freelanceapp.controller;

import com.cj.freelanceapp.ServiceImp.FeedbackServiceImp;
import com.cj.freelanceapp.dto.FeedbackDTO;
import com.cj.freelanceapp.model.Feedback;
import com.cj.freelanceapp.security.SuccessfullLoginHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@RestController
public class FeedbackController {

    /**
     * FEEDBACK MODULE CONTROLLER
     * WITH REST END POINT DEFINITIONS AND SOME BUSINESS LOGICS
     * AUTHOR MILLION SHARBE
     * DATE JUN4 , 2022
     */
    @Autowired
    private FeedbackServiceImp feedbackServiceImp;

    @Autowired
    SuccessfullLoginHandler successfullLoginHandler;

    /**
     * @param feedbackDTO
     * @return
     */
    @RequestMapping("/addfeedback")
    public ModelAndView add_feedback(FeedbackDTO feedbackDTO) {
        if (!feedbackDTO.getContent().isEmpty()) {
            Feedback feedback = Feedback.builder()
                    .feedbackContent(feedbackDTO.getContent())
                    .feedbackDate(new Date())
                    .user(successfullLoginHandler.getUser())
                    .build();
            feedbackServiceImp.add_feedback(feedback);
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("contactus");
        return modelAndView;
    }

    /**
     * @param id
     * @return
     */
    @RequestMapping("/api/get_feedback")
    public Feedback get_feedback(long id) {
        return feedbackServiceImp.get_feedback(id);
    }

    /**
     * @return
     */
    @RequestMapping("/api/feedbacks")
    public List<Feedback> feedbacks() {
        return feedbackServiceImp.all_feedback();
    }

    /**
     * @param id
     * @return
     */
    @RequestMapping("/api/delete_feedback")
    public String delete_feedback(long id) {
        feedbackServiceImp.delete_feedback(id);
        return "addskill.jsp";
    }

    /**
     * @return
     */
    @RequestMapping("/api/delete_all_feedback")
    public String delete_all_feedback() {
        feedbackServiceImp.delete_all();
        return "addskill.jsp";
    }
}
