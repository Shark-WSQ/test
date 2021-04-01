package com.bjpowernode;

import static org.junit.Assert.assertTrue;

import com.bjpowernode.services.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


public class AppTest {

    @Test
    public void Test01(){
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Service service = (Service) applicationContext.getBean("someService");
        service.doSome();
    }

    @Test
    public void Test02(){
        //获取Spring容器中的对象数量
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        System.out.println(applicationContext.getBeanDefinitionCount());

        //获取Spring容器中的对象名称
        String names[] = applicationContext.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }
    }

    @Test
    public void Test03(){
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Date date = (Date)applicationContext.getBean("date");
        System.out.println(date);
    }
}
