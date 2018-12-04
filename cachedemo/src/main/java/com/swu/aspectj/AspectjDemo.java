package com.swu.aspectj;

import com.swu.cache.Cachestu;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class AspectjDemo {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 增强方法，redis有数据时在redis里面获取
     *
     * @return
     */
    public Object aspectjFun(ProceedingJoinPoint pjp) {
        //缓存数据名称
        Object redisResult = null;
        //获取被代理的目标对象
        Object target = pjp.getTarget();
        //获取代理对象的字节码文件
        Class<?> targetClass = target.getClass();
        //获取方法名称
        String methodName = pjp.getSignature().getName();
        //获取方法参数
        Object[] args = pjp.getArgs();
        //存放参数的字节码对象
        Object[] argsArr = new Object[args.length];
        for (int i = 0; i < args.length; i++) {
            argsArr[i] = args[i];
        }
        //获取被代理对象的方法
        Method[] methods = targetClass.getMethods();
        //判断是否有注解
        for (Method method : methods) {
            //处理异常
            try {
                //如果有注解
                if (method.isAnnotationPresent(Cachestu.class)) {
                    //判断缓存是否有数据
                    redisResult = redisTemplate.boundHashOps("cache").get(methodName + args.length);
                    //如果缓存没有数据
                    if (redisResult == null) {
                        //在数据库中查数据
                        redisResult = pjp.proceed(args);
                        redisTemplate.boundHashOps("cache").get(methodName + args.length);
                    }
                    //没有注解
                } else {
                    redisResult = pjp.proceed();
                }
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        System.out.println("aspectj...");
        return redisResult;
    }
}
