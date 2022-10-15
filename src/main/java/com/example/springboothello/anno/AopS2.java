package com.example.springboothello.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Order(6)
public class AopS2 {

    @Pointcut("execution( public *  com.example.springboothello.service..*(..)) ")
    public void sendPoint(){}

    @Around(value = "sendPoint()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //获取方法名
        Signature signature = proceedingJoinPoint.getSignature();
        //获取方法信息
        Object[] args = proceedingJoinPoint.getArgs();
        Object result = null;
        try {
            //前置通知
            System.out.println("环绕通知strat:"+signature.getName()+"方法开始执行，参数为："+ Arrays.asList(args));
            //通过反射的方式调用目标的方法，相当于执行method.invoke(),可以自己修改结果值
            result = proceedingJoinPoint.proceed(args);
            //返回通知：返回执行结果之后执行
            System.out.println("环绕通知stop:"+signature.getName()+"方法执行结束");
        }catch (Throwable throwable) {
            //异常通知
            System.out.println("环绕异常通知："+signature.getName()+"出现异常");
            throw  throwable;
        }finally {
            //后置通知：在方法执行结束之后执行
            System.out.println("环绕返回通知："+signature.getName()+"方法返回结果："+result);
        }
        return result;
    }
}
