package com.hbzhao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 浮生若梦 on 2017/4/1.
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private Integer age;
    private String cupSize;

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
