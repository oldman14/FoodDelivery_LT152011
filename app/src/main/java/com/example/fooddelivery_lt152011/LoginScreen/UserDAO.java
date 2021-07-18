package com.example.fooddelivery_lt152011.LoginScreen;

import android.content.Context;

import com.example.fooddelivery_lt152011.networking.Http.HttpAdapter;
import com.example.fooddelivery_lt152011.networking.Service.SystemService;


public class UserDAO {
    SystemService systemService;

    public UserDAO() {

        com.example.fooddelivery_lt152011.networking.Http.HttpAdapter adapter = new HttpAdapter();
        adapter.setBaseUrl("http://192.168.171.2/");// chỗ này ko cần http à
        systemService = adapter.create(SystemService.class);
    }


    public ModelStatusUser loginRegisDevice(String phone, String token){
        ModelStatusUser status = systemService.loginRegisDevice(phone, token);
        return status;
    }

    public ModelUser getUser(String phone){
        ModelUser user = systemService.getUser(phone);
        return user;
    }

    public  ModelUser getUserNames(int phone){
        ModelUser nameimg=systemService.getUserNames( phone );
        return nameimg;
    }



}
