package com.hxxzt.controller;

import com.hxxzt.entity.Test;
import com.hxxzt.service.ITestService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class DemoController {

    @Resource
    private ITestService testService;

    @RequestMapping("/all")
    public List<Test> all() {
        return testService.SelectAll();
    }

    @RequestMapping("/find/{ID}")
    public Test find(@PathVariable String ID) {
        return testService.getId(ID);
    }

}
