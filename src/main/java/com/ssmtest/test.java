package com.ssmtest;

import com.ssmtest.config.SpringConfig;
import com.ssmtest.pojo.Stu;
import com.ssmtest.service.StuService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class test {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        StuService ss = ac.getBean(StuService.class);
        for (Stu stu : ss.selectAll()) {
            System.out.println(stu);
        }
        Stu stu = new Stu(202410,"testn",0,18, new Date());
        //System.out.println(ss.selectById(202306));
        //ss.update(stu);
        //System.out.println(ss.selectById(202306));
        //ss.save(stu);
        //System.out.println(ss.selectById(202410));
        //ss.delete(202309);
        //System.out.println(ss.selectById(202309));
    }
}
