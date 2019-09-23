package com.phoenix.getserverinfo.controller;

import com.phoenix.getserverinfo.po.*;
import com.phoenix.getserverinfo.service.GetOSInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author tangbojin
 * @Date 2019/8/9 10:15
 */
@Controller
public class GetOSInfoController {

    Logger logger = LoggerFactory.getLogger(GetOSInfoController.class);

    @Resource
    GetOSInfoService getOSInfoService;

    @RequestMapping("/osinfo")
    @ResponseBody
    public Server getOSInfo() {

        Server server = getOSInfoService.getOSInfo();
        Gpu gpuInfo = getOSInfoService.getNavidiaInfo();
        server.setGpu(gpuInfo);

        Cpu serverCpu = server.getCpu();
        Jvm serverJvm = server.getJvm();
        Mem serverMem = server.getMem();
        Sys serverSys = server.getSys();
        List<SysFile> serverSysFiles = server.getSysFiles();
        /*System.out.println("---------------------------------------------");
        System.out.println(serverCpu.toString());
        System.out.println("---------------------------------------------");
        System.out.println(serverJvm.toString());
        System.out.println("---------------------------------------------");
        System.out.println(serverMem.toString());
        System.out.println("---------------------------------------------");
        System.out.println(serverSys.toString());
        System.out.println("---------------------------------------------");
        System.out.println(serverSysFiles.toString());*/
        logger.info(serverCpu.toString());
        logger.info(serverJvm.toString());
        logger.info(serverMem.toString());
        logger.info(serverSys.toString());
        logger.info(serverSysFiles.toString());

        return server;
    }

}
