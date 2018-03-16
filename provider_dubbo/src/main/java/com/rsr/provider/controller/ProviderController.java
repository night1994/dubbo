
/*
 * 文件名：ProviderController.java
 * 版权：Copyright by www.rsrtech.net
 * 描述：
 * 修改人：郑净云
 * 修改时间：2018年3月16日
 */

package com.rsr.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/provider")
public class ProviderController {
    
    @ResponseBody
    @RequestMapping("/say")
    public String say(){
        return "hello word";
    }
}

