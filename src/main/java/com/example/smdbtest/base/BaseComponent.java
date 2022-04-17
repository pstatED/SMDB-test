package com.example.smdbtest.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BaseComponent {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @PostConstruct
    public void init(){
        logger.trace("Loaded {}.", getClass());
    }

    @PreDestroy
    public void destroy(){
        logger.trace("{} is about to be destroyed.", getClass());
    }
}
