package com.cui.phs.controller;


import com.cui.phs.entity.*;
import com.cui.phs.service.facade.DiseaseService;
import com.cui.phs.service.facade.QuizService;
import com.cui.phs.service.facade.UserService;
import com.cui.phs.service.facade.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by q_cui on 2018/4/15
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private DiseaseService diseaseService;

    @Autowired
    private QuizService quizService;

    @Autowired
    private WorkService workService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultEntity login(String userName, String password){
        ResultEntity resultEntity = userService.getVerifyResult(userName,password);
        return resultEntity;
    }

    @RequestMapping(value = "/disease/all", method = RequestMethod.POST)
    public Map<String,List<DiseaseEntity>> getAllDisease(){
        return diseaseService.getAllDisease();
    }

    @RequestMapping(value = "/disease/detail", method = RequestMethod.POST)
    public DiseaseFrontEntity getDisease(Integer diseaseId){
        return diseaseService.getDisease(diseaseId);
    }

    @RequestMapping(value = "/quiz/detail", method = RequestMethod.POST)
    public List<QuizEntity> getQuiz(Integer diseaseId){
        return quizService.getRandomQuiz(diseaseId);
    }

    @RequestMapping(value = "/work/detail", method = RequestMethod.POST)
    public List<WorkEntity> getWork(Integer jobId){
        return workService.getWorksByJobId(jobId);
    }









}
