package com.fgh.task2.service;




import com.fgh.task2.dao.StuDao;
import com.fgh.task2.model.Stu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuDao stuDao;


    public Integer allCount()throws Exception{
        return stuDao.allCount();
    }

    public List<Stu> findOutstanding()throws Exception{
        return stuDao.findOutstanding();
    }

    public Integer findWorking()throws Exception{
        return stuDao.findWorking();
    }



}
