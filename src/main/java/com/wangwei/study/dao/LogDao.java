package com.wangwei.study.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wangwei on 2018/4/1.
 */
@Component
public class LogDao {
    private static final Logger logger = LoggerFactory.getLogger(LogDao.class);

    public void log(){
        logger.debug("LogDao debug.......");
        logger.info("LogDao info.......");
        logger.warn("LogDao warn.......");
        logger.error("LogDao error.......");
    }
}
