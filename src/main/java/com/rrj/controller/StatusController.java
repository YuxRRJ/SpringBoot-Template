package com.rrj.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController
{
    private Logger logger = LogManager.getLogger(this.getClass());

    @GetMapping("faq")
    public String faq()
    {
        logger.info("Service OK !");
        return "Service OK !";
    }
}
