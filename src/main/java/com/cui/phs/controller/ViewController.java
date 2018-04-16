package com.cui.phs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by q_cui on 2018/4/5
 */
@Controller
@RequestMapping("/")
public class ViewController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){return "login";}

    @RequestMapping("/rolePlay")
    public String rolePlay(){
        return "rolePlay/roleChoose";
    }

    @RequestMapping("/rolePlay/assistant")
    public String assistant(){
        return "rolePlay/assistant";
    }

    @RequestMapping("/rolePlay/doctor")
    public String doctor(){
        return "rolePlay/doctor";
    }

    @RequestMapping("/rolePlay/receptionist")
    public String receptionist(){
        return "rolePlay/receptionist";
    }

    @RequestMapping("/navigation/")
    public String navigation(){
        return "navigation/allNavigation";
    }

    @RequestMapping("/caseStudy")
    public String caseChoose(){
        return "caseStudy/caseChoose";
    }

    @RequestMapping("/caseStudy/diseaseStudy/{id}")
    public String diseaseStudy(){
        return "caseStudy/diseaseStudy";
    }

    @RequestMapping("/quizChoose")
    public String quizChoose(){
        return  "quiz/quizChoose";
    }

    @RequestMapping("/quiz/{diseaseId}")
    public String quizTest(){
        return  "quiz/quizTest";
    }


}
