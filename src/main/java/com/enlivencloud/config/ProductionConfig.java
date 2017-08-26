package com.enlivencloud.config;

import com.enlivencloud.backend.service.EmailService;
import com.enlivencloud.backend.service.SmptEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by dtruong1801 on 8/13/17.
 */
@Configuration
@Profile("Prod")
@PropertySource("file:///${user.home}/enlivencloud/.enlivencloud/application-prod.properties")
public class ProductionConfig {

    @Bean
    public EmailService emailService() {
        return new SmptEmailService();
    }
}
