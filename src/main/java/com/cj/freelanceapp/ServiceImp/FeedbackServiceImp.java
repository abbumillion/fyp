package com.cj.freelanceapp.ServiceImp;

import com.cj.freelanceapp.model.Feedback;
import com.cj.freelanceapp.repository.FeedbackRepo;
import com.cj.freelanceapp.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImp implements FeedbackService {
    @Autowired
    private FeedbackRepo feedbackRepo;

    /**
     *
     * @param feedback
     */
    @Override
    public void add_feedback(Feedback feedback) {
        feedbackRepo.save(feedback);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Feedback get_feedback(long id) {
        return feedbackRepo.getReferenceById(id);
    }

    @Override
    public List<Feedback> all_feedback() {
        return feedbackRepo.findAll();
    }

    /**
     *
     * @param id
     */
    @Override
    public void delete_feedback(long id) {
        feedbackRepo.deleteById(id);
    }

    /**
     *
     */
    @Override
    public void delete_all() {
        feedbackRepo.deleteAll();
    }
}
