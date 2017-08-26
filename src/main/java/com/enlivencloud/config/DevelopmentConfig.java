package com.enlivencloud.config;

import com.enlivencloud.backend.service.EmailService;
import com.enlivencloud.backend.service.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by dtruong1801 on 8/13/17.
 */
@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/enlivencloud/.enlivencloud/application-dev.properties")
public class DevelopmentConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
