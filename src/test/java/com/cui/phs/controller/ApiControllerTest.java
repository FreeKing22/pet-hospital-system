package com.cui.phs.controller;

import com.cui.phs.entity.*;
import com.cui.phs.service.facade.DiseaseService;
import com.cui.phs.service.facade.QuizService;
import com.cui.phs.service.facade.WorkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by q_cui on 2018/4/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiControllerTest {

    @Autowired
    private DiseaseService diseaseService;

    @Autowired
    private QuizService quizService;

    @Autowired
    private WorkService workService;

    @Test
    public void diseaseTest() {
        Map<String,List<DiseaseEntity>> map = diseaseService.getAllDisease();
        List<DiseaseEntity> diseaseEntities = map.get("one");
        DiseaseFrontEntity frontEntity = diseaseService.getDisease(diseaseEntities.get(0).getId());
        List<CaseEntity> caseEntities = frontEntity.getCaseList();
        caseEntities.size();
    }

    @Test
    public void quizTest() {
        List<QuizEntity> quizEntities = quizService.getRandomQuiz(1);
        quizEntities.size();
    }

    @Test
    public void workTest() {
        List<WorkEntity> workEntities = workService.getWorksByJobId(1);
        workEntities.size();
    }






}
