package com.carmelcarreto.agencia.controller;

import com.carmelcarreto.agencia.model.User;
import com.carmelcarreto.agencia.repository.UserRepository;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Carmel
 */
@Controller
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    @RequestMapping(value = "/user")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
        List<User> users = userRepository.findAll();
        ModelAndView model = new ModelAndView();
        model.setViewName("user/index");
        model.addObject("users", users);
        return model;
    }
    
    
}
