package com.ssmtest.controller;

import com.ssmtest.pojo.Stu;
import com.ssmtest.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/stu",produces = {"application/json;charset=UTF-8"})
@RestController     //@Controller和@Responsebody的合体
public class StuController {
    @Autowired
    StuService stuService;

    @GetMapping
    public Result selectAll(){
        List<Stu> stuList = stuService.selectAll();
        Integer code = stuList != null ? Code.SELECTE_OK : Code.SELECTE_ERR;
        String msg = stuList != null ? "查询成功":"查询失败";
        return new Result(code,stuList,msg);
    }
    @PutMapping
    public Result update(@RequestBody Stu stu){    //用来接收json
        System.out.println(stu);
        boolean flag = stuService.update(stu);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }
    @PostMapping
    public Result save(@RequestBody Stu stu){  //用来接收json
        boolean flag = stuService.save(stu);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") int id){  //获取url中id
        boolean flag = stuService.delete(id);
        return new Result(flag != false ? Code.DELETE_OK : Code.DELETE_ERR,flag);
    }
    @GetMapping("/{id}")
    public Result selectById(@PathVariable("id") int id){  //获取url中id
        Stu stu = stuService.selectById(id);
        Integer code = stu != null ? Code.SELECTE_OK : Code.SELECTE_ERR;
        String msg = stu != null ? "查询成功":"查询失败";
        return new Result(code,stu,msg);
    }
}
