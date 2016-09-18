package com.jh.webmagic.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan("com.jh.webmagic.*")
//@ComponentScan
//@ImportResource("classpath*:spring-context.xml")
//@EnableScheduling
//@SpringBootApplication(exclude = {GithubRepo.class})

@SpringBootApplication
@EnableAdminServer
public class StartMainServer {
    
    private static final Logger logger = LoggerFactory.getLogger(StartMainServer.class);
    
    public static void main(String[] args) {
        logger.info("启动项目配置开始...");
        SpringApplication.run(StartMainServer.class, args);
        logger.info("启动项目配置结束...");
    }
    
}
