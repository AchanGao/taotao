package com.taotao.manager.service.impl;

import com.taotao.manager.mapper.TestMapper;
import com.taotao.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gyx
 * @version 1.0
 * @description com.taotao.manager.service.impl
 * @date 2018/1/9
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;
    @Override
    public String queryDate() {
        return testMapper.queryDate();
    }
}
