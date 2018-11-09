package com.example.ssm.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: ssm
 * @description:
 * @author: 尊尊
 * @create: 2018-10-07 22:39
 **/
@Component
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}
