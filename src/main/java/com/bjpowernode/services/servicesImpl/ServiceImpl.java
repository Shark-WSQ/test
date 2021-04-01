package com.bjpowernode.services.servicesImpl;

import com.bjpowernode.services.Service;

public class ServiceImpl implements Service {
    @Override
    public void doSome() {
        System.out.println("执行了service的doSome()方法");
    }
}
