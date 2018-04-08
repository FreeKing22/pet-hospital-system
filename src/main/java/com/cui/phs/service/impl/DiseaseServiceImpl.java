package com.cui.phs.service.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cui.phs.entity.ImageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cui.phs.mapper.DiseaseMapper;
import com.cui.phs.entity.DiseaseEntity;
import com.cui.phs.entity.DiseaseEntity;
import com.cui.phs.service.facade.DiseaseService;

@Service
public class DiseaseServiceImpl implements DiseaseService {
    @Autowired
    private DiseaseMapper diseaseDao;


    @Transactional
    public ImageEntity findImage(int id) {
        return this.diseaseDao.findImage(id);
    }

    @Transactional
    public DiseaseEntity findDisease(int id) {
        DiseaseEntity result = this.diseaseDao.findDisease(id);
        int imageId = result.getImageId();

        ArrayList images;
        ImageEntity i;
        for(images = new ArrayList(); imageId != 0; imageId = i.getNextId()) {
            i = this.diseaseDao.findImage(imageId);
            images.add(i);
        }

        result.setImages(images);
        return result;
    }

    @Transactional
    public List<DiseaseEntity> listDiseaseByKind(int kindId) {
        List<DiseaseEntity> result = this.diseaseDao.listDiseaseByKind(kindId);
        Iterator var3 = result.iterator();

        while(var3.hasNext()) {
            DiseaseEntity d = (DiseaseEntity)var3.next();
            List<ImageEntity> images = new ArrayList();

            ImageEntity i;
            for(int imageId = d.getImageId(); imageId != 0; imageId = i.getNextId()) {
                i = this.diseaseDao.findImage(imageId);
                images.add(i);
            }
        }

        return result;
    }
}
