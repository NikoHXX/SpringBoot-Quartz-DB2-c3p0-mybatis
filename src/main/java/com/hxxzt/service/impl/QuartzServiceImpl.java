package com.hxxzt.service.impl;

import com.hxxzt.service.IQuartzService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class QuartzServiceImpl implements IQuartzService {

    private static final Logger logger = LoggerFactory.getLogger(QuartzServiceImpl.class);
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @Override
    public int printTask() {
        logger.info("Print task, time is {}", sdf.format(new Date()));
        return 0;
    }

}