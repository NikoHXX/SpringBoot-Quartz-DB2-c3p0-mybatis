package com.hxxzt.service;

import com.hxxzt.entity.Test;

import java.util.List;

public interface ITestService {

    List<Test> SelectAll();

    Test getId(String ID);

}