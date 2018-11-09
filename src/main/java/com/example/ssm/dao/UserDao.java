package com.example.ssm.dao;

import com.example.ssm.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @program: ssm
 * @description: user Dao层
 * @author: 尊尊
 * @create: 2018-10-07 23:21
 **/
@Mapper
@Repository
public interface UserDao {

    int insert(User record);

    User selectByPrimaryKey(Integer id);




}
