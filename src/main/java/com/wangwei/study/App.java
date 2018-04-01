package com.wangwei.study;

import com.wangwei.study.dao.LogDao;
import com.wangwei.study.service.LogService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.websocket.WebSocketMessagingAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * springboot的默认日志级别:INFo,可以通过logging.level.*=debug属性进行设置.*-可以是包，也可以是某个类，还可以指定为root（全局有效）.
 *    几种日志级别： TRACE, DEBUG, INFO, WARN, ERROR, FATAL, OFF
 *  指定日志文件输出位置
        logging.file=E:/temp/logs/mylog.log
    指定日志文件输出目录，生成的默认日志文件名为spring.log
        logging.path=E:/temp/logs
    这两种方式，日志文件大小超过10MB自动分割。

   除了可以在application.properties中对日志进行配置外，还可以通过日志配置文件的形式。
        springboot默认日志组件为：logback。相对应的的配置文件为logback.xml.只需要将配置文件放在classpath下即可。
        logback配置文件名称除了可以是logback.xml，还可以是logback-spring.xml,springboot推荐使用logback-spring.xml

   使用其他日志组件的步骤：
    1) 排除掉默认的日志组件：
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-logging</artifactId>
    2)加入新的日志组件依赖。
    3)把新日志组件对应的配置文件放到classpath下。
 */
//@SpringBootApplication(exclude = {WebSocketMessagingAutoConfiguration.class})
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.getBean(LogDao.class).log();
        context.getBean(LogService.class).log();
        context.close();
    }
}
