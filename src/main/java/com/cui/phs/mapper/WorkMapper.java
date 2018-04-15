package com.cui.phs.mapper;

import com.cui.phs.entity.WorkEntity;

import java.util.List;

/**
 * Created by q_cui on 2018/4/15
 */
public interface WorkMapper {

    List<WorkEntity> getWorkByJobId(int jobId);

}
