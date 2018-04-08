package com.cui.phs.mapper;

import java.util.List;
import com.cui.phs.entity.CaseEntity;

public interface CaseMapper {
    List<CaseEntity> findCaseByDisease(int var1);

    CaseEntity findCase(int var1);
}
