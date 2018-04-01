package com.wangwei.study.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wangwei on 2018/4/1.
 */
@Component
public class LogService {
    private static final Logger logger = LoggerFactory.getLogger(LogService.class);

    public void log(){
        logger.debug("LogService debug.......");
        logger.info("LogService info.......");
        logger.warn("LogService warn.......");
        logger.error("LogService error.......");
    }
}
