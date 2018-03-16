
/*
 * 文件名：ProviderServiceImpl.java
 * 版权：Copyright by www.rsrtech.net
 * 描述：
 * 修改人：郑净云
 * 修改时间：2018年3月16日
 */

package com.rsr.provider.service.impl;

import org.springframework.stereotype.Service;

import com.rsr.provider.service.ProviderService;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService{

    public String sayHello() {
        
        return "hello night";
        
    }
    
}

