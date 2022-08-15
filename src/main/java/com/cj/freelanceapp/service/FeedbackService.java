package com.cj.freelanceapp.service;


import com.cj.freelanceapp.model.Feedback;

import java.util.List;

public interface FeedbackService {
    /**
     * add feedback to database
     * @param feedback
     */
    void add_feedback(Feedback feedback);

    /**
     * get feedback by id
     * @param id
     * @return
     */
    Feedback get_feedback(long id);

    /**
     * list all feedbacks
     * @return
     */
    List<Feedback> all_feedback();

    /**
     * delete feedback by id
     * @param id
     */
    void delete_feedback(long id);

    /**
     * delete all feedbacks
     */
    void delete_all();
}
