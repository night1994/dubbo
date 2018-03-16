
/*
 * 文件名：CommonServiceImpl.java
 * 版权：Copyright by www.rsrtech.net
 * 描述：
 * 修改人：郑净云
 * 修改时间：2018年3月16日
 */

package com.rsr.provider.service.impl;

import org.springframework.stereotype.Service;

import com.rsr.dubbo.service.CommonService;

@Service("commonService")
public class CommonServiceImpl implements CommonService{

    @Override
    public String getCommonMes() {
        
        return "congratulations  you are success";
        
    }
    
    
}

