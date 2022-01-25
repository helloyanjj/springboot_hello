package com.example.springboot_hello.jdkInvoke;

public class SmsServiceImp implements SmsService{
    @Override
    public String send(String msg) {
        System.out.println("send message:" + msg);
        return msg;
    }
}
