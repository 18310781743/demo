package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.example.demo.entity.UserDO;

@Mapper
public interface UserDao {
    int insert(@Param("userDO") UserDO userDO);

    int insertSelective(@Param("userDO") UserDO userDO);

    int insertList(@Param("userDOs") List<UserDO> userDOs);

    int update(@Param("userDO") UserDO userDO);
}
