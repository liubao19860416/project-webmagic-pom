package com.jh.webmagic.main.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Scheduled(fixedRate = 500)
    public void reportCurrentTime() {
        System.out.println("Testing successful ");
    }
}