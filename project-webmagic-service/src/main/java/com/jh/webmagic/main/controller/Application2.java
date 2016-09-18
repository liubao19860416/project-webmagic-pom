package com.jh.webmagic.main.controller;

import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.WebApplicationInitializer;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableScheduling
public class Application2 implements WebApplicationInitializer {

//    public static void main(String[] args) throws Exception {
//    }

    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {
        SpringApplication.run(Application2.class);
    }
    
    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
        factory.setPort(8081);
        factory.setSessionTimeout(50, TimeUnit.MINUTES);
        return factory;
    }

}