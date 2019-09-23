package com.phoenix.getserverinfo.service.impl;

import com.phoenix.getserverinfo.po.Gpu;
import com.phoenix.getserverinfo.po.Server;
import com.phoenix.getserverinfo.service.GetOSInfoService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author tangbojin
 * @Date 2019/8/9 11:11
 */

@Service
public class GetOSInfoServiceImpl implements GetOSInfoService {
    @Override
    public Server getOSInfo() {
        Server server = new Server();
        try {
            server.copyTo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return server;
    }

    @Override
    public Gpu getNavidiaInfo() {
        Process pro = null;
        Runtime r = Runtime.getRuntime();
        Gpu gpu = new Gpu();
        String message = new String();
        try {
            String command = "nvidia-smi"+" "+"-q";
            System.out.println("执行的命令时-------------"+command);
            pro = r.exec(command);
            BufferedReader in = new BufferedReader(new InputStreamReader(pro.getInputStream(),"UTF-8"));
            String line = null;
            while((line=in.readLine()) != null){
                message += line+"\n";
            }
            in.close();
            pro.destroy();
        } catch (Exception e) {
            System.out.println("获取gpu信息失败");
            return null;
        }
        System.out.println(message);
        String[] props = message.split("\\n");
        gpu.setDriverVersion(props[4].split(":")[1]);
        gpu.setProductName(props[8].split(":")[1]);
        gpu.setPerformanceState(props[56].split(":")[1]);
        gpu.setTotalMem(props[65].split(":")[1]);
        return gpu;
    }
}
