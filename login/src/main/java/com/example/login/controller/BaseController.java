package com.example.login.controller;

import com.example.login.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class BaseController {

@Autowired
protected AdminService adminService;




}