
/*
 * 文件名：SpringBootAplication.java
 * 版权：Copyright by www.rsrtech.net
 * 描述：
 * 修改人：郑净云
 * 修改时间：2017年5月17日
 */

package com.rsr.provider.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.rsr*")
@ImportResource("classpath:dubbo-provider.xml")
public class SpringBootAplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootAplication.class, args);
    }

}

