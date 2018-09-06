package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.demo.entity.UserDO;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;

@Service
public class UseServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    @Override
    public int insert(UserDO userDO){
        return userDao.insert(userDO);
    }

    @Override
    public int insertSelective(UserDO userDO){
        return userDao.insertSelective(userDO);
    }

    @Override
    public int insertList(List<UserDO> userDOs){
        return userDao.insertList(userDOs);
    }

    @Override
    public int update(UserDO userDO){
        return userDao.update(userDO);
    }
}
