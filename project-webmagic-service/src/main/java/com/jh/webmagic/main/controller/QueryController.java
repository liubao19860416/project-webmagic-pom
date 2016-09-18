package com.jh.webmagic.main.controller;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QueryController {

    private static final Logger LOGGER = Logger.getLogger(QueryController.class);

    public QueryController() {
    }
    
    @RequestMapping(value = "/test")
    public ModelAndView testView(){
        return new ModelAndView("test");
    }
}