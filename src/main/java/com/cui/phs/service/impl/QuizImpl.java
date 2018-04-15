package com.cui.phs.service.impl;

import com.cui.phs.entity.CaseEntity;
import com.cui.phs.entity.QuizEntity;
import com.cui.phs.mapper.QuizMapper;
import com.cui.phs.service.facade.QuizService;
import com.cui.phs.utils.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by q_cui on 2018/4/15
 */
@Service
public class QuizImpl implements QuizService {

    @Autowired
    private QuizMapper quizMapper;

    @Override
    public List<QuizEntity> getRandomQuiz(int diseaseId){
        List<QuizEntity> quizEntities = quizMapper.getQuizByDiseaseId(diseaseId);
        quizEntities = ListUtils.createRandomList(quizEntities,10);
        List<QuizEntity> quizList = new ArrayList<>();
        for (QuizEntity quizEntity:quizEntities) {
            quizEntity.setChoiceList(Arrays.asList(quizEntity.getChoice_list().split("&&")));
            quizList.add(quizEntity);
        }
        return quizList;
    }



}
