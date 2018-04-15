package com.cui.phs.service.facade;

import com.cui.phs.entity.WorkEntity;

import java.util.List;

/**
 * Created by q_cui on 2018/4/15
 */
public interface WorkService {

    List<WorkEntity> getWorksByJobId(int jobId);

}
