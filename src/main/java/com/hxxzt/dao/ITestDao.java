package com.hxxzt.dao;

import com.hxxzt.entity.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ITestDao {
    List<Test> All();

    Test findById(@Param("ID") String ID);

}