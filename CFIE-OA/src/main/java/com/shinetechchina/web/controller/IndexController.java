package com.shinetechchina.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shinetechchina.entity.User;
import com.shinetechchina.service.UserService;
  
@Controller  
@RequestMapping("/")
public class IndexController {  
  
	@Autowired
	private UserService userService;
	
    @RequestMapping("/add")
    public String druid() {
    	
    	User user = new User(); 
    	user.setAdmin(Boolean.TRUE);
    	user.setCanceled(Boolean.FALSE);
    	user.setCanceledBy(null);
    	user.setCanceledDate(null);
    	user.setCreatedBy(null);
    	user.setCreatedDate(null);
    	user.setEmail("xuht@shinetechchina.com");
    	user.setLastModifiedBy(null);
    	user.setLastModifiedDate(null);
    	user.setMobilePhoneNumber("18622587275");
    	user.setPassword("xuht1234");
    	user.setSalt("xuht");
    	user.setUsername("xuht");
    	
    	userService.save(user);
    	
        return "redirect:admin/monitor/druid/index";
    }
    
    @RequestMapping("/monitor")
    public String monitor() {
    	
        return "redirect:admin/monitor/druid/index";
    }  
}  
