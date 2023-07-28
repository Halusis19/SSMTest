package com.ssmtest.service.impl;

import com.ssmtest.dao.StuDao;
import com.ssmtest.pojo.Stu;
import com.ssmtest.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StuDao stuDao;
    @Override
    public List<Stu> selectAll() {
        return stuDao.selectAll();
    }

    @Override
    public boolean save(Stu stu) {
        stuDao.save(stu);
        return true;
    }

    @Override
    public boolean delete(int id) {
        stuDao.delete(id);
        return true;
    }

    @Override
    public boolean update(Stu stu) {
        stuDao.update(stu);
        return true;
    }

    @Override
    public Stu selectById(int id) {
        return stuDao.selectById(id);
    }
}
