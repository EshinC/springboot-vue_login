package com.example.login.service;


import com.example.login.dao.AdminDao;
import com.example.login.domain.Admin;
import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService extends BaseService<Admin,Integer> {

    @Autowired
    AdminDao adminDao;
    public Admin findByUsername(String username){
        System.out.println(username);
        return this.adminDao.findByUsername(username);
    }
}
