package com.uallessonivo.springbootcourse.config;

import com.uallessonivo.springbootcourse.common.Coach;
import com.uallessonivo.springbootcourse.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
