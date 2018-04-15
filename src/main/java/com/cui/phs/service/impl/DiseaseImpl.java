package com.cui.phs.service.impl;

import com.cui.phs.entity.CaseEntity;
import com.cui.phs.entity.DiseaseEntity;
import com.cui.phs.entity.DiseaseFrontEntity;
import com.cui.phs.mapper.CaseMapper;
import com.cui.phs.mapper.DiseaseMapper;
import com.cui.phs.service.facade.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by q_cui on 2018/4/15
 */
@Service
public class DiseaseImpl implements DiseaseService {

    @Autowired
    private CaseMapper caseMapper;

    @Autowired
    private DiseaseMapper diseaseMapper;

    @Override
    public Map<String,List<DiseaseEntity>> getAllDisease(){
        List<DiseaseEntity> firstKind = diseaseMapper.getDiseaseByKindId(1);
        List<DiseaseEntity> secondKind = diseaseMapper.getDiseaseByKindId(2);
        List<DiseaseEntity> thirdKind = diseaseMapper.getDiseaseByKindId(3);
        List<DiseaseEntity> forthKind = diseaseMapper.getDiseaseByKindId(4);
        Map<String,List<DiseaseEntity>> kindMap = new HashMap<>();
        kindMap.put("one",firstKind);
        kindMap.put("two",secondKind);
        kindMap.put("three",thirdKind);
        kindMap.put("four",forthKind);
        return kindMap;
    }

    @Override
    public DiseaseFrontEntity getDisease(int diseaseId){
        DiseaseEntity diseaseEntity = diseaseMapper.getDiseaseById(diseaseId);
        DiseaseFrontEntity frontEntity = new DiseaseFrontEntity(diseaseEntity);
        List<CaseEntity> caseEntities = caseMapper.getCaseByDiseaseId(diseaseId);
        List<CaseEntity> caseList = new ArrayList<>();
        for (CaseEntity caseEntity:caseEntities) {
            caseEntity.setImageList(Arrays.asList(caseEntity.getImage_list().split("&&")));
            caseList.add(caseEntity);
        }
        frontEntity.setCaseList(caseList);
        return frontEntity;
    }


}
