package com.codline.Schedule.Models;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    @Scheduled(cron = "* 0 * 1-15 * *")

    public void scheulde01() {

        System.out.print("Hello Word");

    }
}
