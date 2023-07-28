package com.ssmtest.service;

import com.ssmtest.pojo.Stu;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional  //事务注释
public interface StuService {
    public List<Stu> selectAll();
    public boolean save(Stu stu);
    public boolean delete(int id);
    public boolean update(Stu stu);
    public Stu selectById(int id);
}
