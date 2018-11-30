package com.hxxzt.service.impl;

import com.hxxzt.entity.Test;
import com.hxxzt.dao.ITestDao;
import com.hxxzt.service.IQuartzService;
import com.hxxzt.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ITestService")
public class TestServiceImpl implements ITestService {

    @Resource
    private ITestDao testDao;

    @Override
    public List<Test> SelectAll() {

        return testDao.All();
    }


    @Override
    public Test getId(String ID) {

        return testDao.findById(ID);
    }
}