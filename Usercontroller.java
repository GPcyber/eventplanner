package com.example.Eduinstitute.controller;

import com.example.Eduinstitute.model.Course;
import com.example.Eduinstitute.model.User;
import com.example.Eduinstitute.repositry.Courserepository;
import com.example.Eduinstitute.repositry.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Usercontroller {

    @Autowired
    Userrepository userrepository;

    @GetMapping("/save")
    //@ResponseBody
    public String saveUser(@Param("uname") String uname, @Param("unumber") String unumber, @Param("uemail") String uemail, @Param("upassword") String upassword) {

        User user = new User();
        user.setUname(uname);
        user.setUnumber(unumber);
        user.setUemail(uemail);
        user.setUpassword(upassword);

        userrepository.save(user);
        return "Signup Successfully ";
    }

    @PostMapping("/save1")
    @ResponseBody
    public String saveUser1(@ModelAttribute User user) {
        userrepository.save(user);
        return "Signed Up Successfully";
    }


    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/home/courses")
    public String getcourses() {
        return "courses";
    }

    @GetMapping("/home/contact")
    public String contact() {
        return "contact";

    }

    @GetMapping("/home/login")
    public String login() {
        return "login";
    }

//    @GetMapping("/home/login/admin")
//    public String admin() {
//        return "admin";
//    }


}
