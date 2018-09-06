package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.UserDO;
public interface UserService{

    int insert(UserDO userDO);

    int insertSelective(UserDO userDO);

    int insertList(List<UserDO> userDOs);

    int update(UserDO userDO);
}
