package com.uallessonivo.springbootcourse.common;

import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach {
    public TenisCoach() {
        System.out.println("In constructor: " + this.getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
