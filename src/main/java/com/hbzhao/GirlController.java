package com.hbzhao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 浮生若梦 on 2017/3/31.
 */
@RestController
public class GirlController {


    @Autowired
    private GirlProperties girlProperties;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Spring boot." + girlProperties.getCupSize();
    }

}
