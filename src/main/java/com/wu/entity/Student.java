package com.wu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("student")
public class Student implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private Date birthday;

}
