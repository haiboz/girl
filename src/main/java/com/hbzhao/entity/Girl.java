package com.hbzhao.entity;


//import org.springframework.data.annotation.Id;
//
//import javax.persistence.GeneratedValue;

//import javax.persistence.GeneratedValue;

//import javax.persistence.GeneratedValue;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;


/**
 * Created by 浮生若梦 on 2017/3/31.
 */
//@org.hibernate.annotations.Entity
@Entity
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer age;

    private String cupSize;

    public Girl(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }
}
