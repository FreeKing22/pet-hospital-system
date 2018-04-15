package com.cui.phs.service.impl;

import com.cui.phs.entity.WorkEntity;
import com.cui.phs.mapper.WorkMapper;
import com.cui.phs.service.facade.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by q_cui on 2018/4/15
 */
@Service
public class WorkImpl implements WorkService{

    @Autowired
    private WorkMapper workMapper;

    @Override
    public List<WorkEntity> getWorksByJobId(int jobId){
        return workMapper.getWorkByJobId(jobId);
    }

}
