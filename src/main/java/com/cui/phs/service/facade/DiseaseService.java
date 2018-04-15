package com.cui.phs.service.facade;

import java.util.List;
import java.util.Map;

import com.cui.phs.entity.DiseaseEntity;
import com.cui.phs.entity.DiseaseFrontEntity;

public interface DiseaseService {

    Map<String,List<DiseaseEntity>> getAllDisease();

    DiseaseFrontEntity getDisease(int diseaseId);

}
