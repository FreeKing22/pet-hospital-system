package com.cui.phs.mapper;

import com.cui.phs.entity.QuizEntity;

import java.util.List;

/**
 * Created by q_cui on 2018/4/15
 */
public interface QuizMapper {

    List<QuizEntity> getQuizByDiseaseId(int diseaseId);

}
