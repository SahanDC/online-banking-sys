package org.trb.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Controller
public class HomeController
{

    Logger log = LoggerFactory.getLogger(HomeController.class);
    //@Autowired
    //private StudentRepository studentRepository;

    // private static final long serialVersionUID = 1L;


    @GetMapping("/home")
    public String home(Model model)
    {
        boolean passCounter = false;
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = (User) auth.getPrincipal();
        for (GrantedAuthority authority:user.getAuthorities()){
            log.info(authority.getAuthority());
            if(authority.getAuthority().equals("ROLE_ADMIN")){
                passCounter = true;
                break;
            }
        }

        String userRole = passCounter ? "admin" : "non-admin";

        if(userRole.equals("admin")) {
            return "index";
        }else{
            return "index-non-admin";
        }
    }

}
