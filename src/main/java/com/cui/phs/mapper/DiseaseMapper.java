package com.cui.phs.mapper;

import java.util.List;
import com.cui.phs.entity.DiseaseEntity;


public interface DiseaseMapper {

    List<DiseaseEntity> getDiseaseByKindId(int kind_id);

    DiseaseEntity getDiseaseById(int id);

}
