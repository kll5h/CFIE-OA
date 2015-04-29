package com.shinetechchina.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
  
@Controller  
@RequestMapping("/")
public class IndexController {  
  
    @RequestMapping("/")
    public String druid() {  
        
        return "redirect:admin/monitor/druid/index";
    }  
}  
