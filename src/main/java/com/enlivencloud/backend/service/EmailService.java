package com.enlivencloud.backend.service;

import com.enlivencloud.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by dtruong1801 on 8/13/17.
 */
public interface EmailService {

    /**
     * Send an email with the content in the Feedback Pojo
     * @param feedbackPojo The feedback Pojo
     */
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo);

    /**
     * Send an email with the content of the Simple Mail Message object
     * @param message The object containing the email content
     */
    public void sendGenericEmailMessage(SimpleMailMessage message);

}
