package com.ssmtest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice   //处理restcontroller的异常，需要被springmvc加载到
public class ProjectExceptionAdice {
    @ExceptionHandler(Exception.class)  //处理异常（所有异常）
    public Result doException(Exception e){
        System.out.println(e);
        return new Result(Code.ERR,null,"出错乐!");
    }
}
