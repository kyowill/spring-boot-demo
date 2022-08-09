package com.app.biz;

import com.app.dal.RunoobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RunoobService {
    @Autowired
    private RunoobMapper runoobMapper;

    public void doQuery() {
        runoobMapper.queryAll(1);
    }
}
