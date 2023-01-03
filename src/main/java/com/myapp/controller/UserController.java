package com.myapp.controller;

import com.myapp.beandao.UserDao;
import com.myapp.enumeration.Gender;
import com.myapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserDao userDao;
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String Login(){
        return "welcome";
    }
    @RequestMapping(value="/register",method = RequestMethod.POST)
    public String Register(){
        User user=new User();
        user.setFirstname("Thanush");
        user.setPassword("ipo");
        user.setGender(Gender.Female);
        user.setEmail("jj");
        user.setLastname("hgh");
        user.setContactno("j");
        user.setPassword("");
        userDao.saveuser(user);
        return "welcome";
    }
}
