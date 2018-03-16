
/*
 * 文件名：CustomController.java
 * 版权：Copyright by www.rsrtech.net
 * 描述：
 * 修改人：郑净云
 * 修改时间：2018年3月16日
 */

package com.rsr.custom.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rsr.dubbo.service.CommonService;

@Controller
@RequestMapping("/custom")
public class CustomController {
    
    
    @Autowired
    private CommonService commonService;
    @ResponseBody
    @RequestMapping("/say")
    public String say(){
        return "hello custom";
    }
    
    @RequestMapping("/remoteSay")
    @ResponseBody
    public String remoteSay(){
        
        String says = commonService.getCommonMes();
        return says;
    }
    @RequestMapping("/remote2Say")
    @ResponseBody
    public String remote2Say(){
        
        String says = commonService.getCommonMes();
        return says;
    }
}

