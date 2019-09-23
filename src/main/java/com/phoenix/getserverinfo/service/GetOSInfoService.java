package com.phoenix.getserverinfo.service;


import com.phoenix.getserverinfo.po.Gpu;
import com.phoenix.getserverinfo.po.Server;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author tangbojin
 * @Date 2019/8/9 11:10
 */
public interface GetOSInfoService {
    Server getOSInfo();

    /**获取navidia的GPU信息*/
    Gpu getNavidiaInfo();

}
