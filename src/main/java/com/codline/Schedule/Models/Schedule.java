package com.codline.Schedule.Models;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    @Scheduled(cron = "* */5 * * * 0-4 +" + " * */15 * * * 5-6")

    public void scheulde01() {

        System.out.print("Hello Word");

    }
}
