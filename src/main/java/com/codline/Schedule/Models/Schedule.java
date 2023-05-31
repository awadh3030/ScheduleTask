package com.codline.Schedule.Models;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    @Scheduled(cron = " * * 12 * 7 1-6")

    public void scheulde01() {

        System.out.print("Hello Word");

    }
}
