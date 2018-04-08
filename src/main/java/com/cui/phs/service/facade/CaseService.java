package com.cui.phs.service.facade;

import java.util.List;
import com.cui.phs.entity.CaseEntity;

public interface CaseService {
    List<CaseEntity> findCaseByDisease(int var1);
}
