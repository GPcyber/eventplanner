package com.example.Eduinstitute.controller;

import com.example.Eduinstitute.model.Course;
import com.example.Eduinstitute.repositry.Courserepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Coursecontroller {

    @Autowired
    Courserepository courserepository;

    @GetMapping("/save3")
    //@ResponseBody
    public String saveCourse (@Param("cid") Long cid,@Param("cname") String cname,  @Param("cduration") String cduration, @Param("csdate") String csdate){

        Course course= new Course();
        course.setCid(cid);
        course.setCname(cname);
        course.setCduration(cduration);
        course.setCsdate(csdate);

        courserepository.save(course);
        return "Entered Successfully ";
    }

    @PostMapping("/save2")
    @ResponseBody
    public String saveCourse2(@ModelAttribute Course course){
        courserepository.save(course);
        return "Data Entered Successfully";
    }

    @GetMapping("/home/login/admin")
    public String admin(){
        return "admin";
    }

}
