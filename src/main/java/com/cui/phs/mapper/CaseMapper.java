package com.cui.phs.mapper;

import java.util.List;
import com.cui.phs.entity.CaseEntity;

public interface CaseMapper {

    List<CaseEntity> getCaseByDiseaseId(int diseaseId);

}
