package com.cui.phs.service.facade;

import java.util.List;
import com.cui.phs.entity.DiseaseEntity;
import com.cui.phs.entity.ImageEntity;

public interface DiseaseService {
    List<DiseaseEntity> listDiseaseByKind(int var1);

    DiseaseEntity findDisease(int var1);

    ImageEntity findImage(int var1);
}
