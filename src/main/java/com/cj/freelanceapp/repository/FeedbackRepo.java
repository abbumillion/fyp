package com.cj.freelanceapp.repository;


import com.cj.freelanceapp.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepo extends JpaRepository<Feedback, Long> {
    Feedback findByFeedbackDate(String feedbackDate);
}
