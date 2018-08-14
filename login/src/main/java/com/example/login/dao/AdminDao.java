package com.example.login.dao;

import com.example.login.domain.Admin;
import com.example.login.jpaRepository.MyRepository;


public interface AdminDao extends MyRepository<Admin,Integer>{
    Admin findByUsername(String username);
}
