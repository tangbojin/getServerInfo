package com.phoenix.getserverinfo.po;


import com.phoenix.getserverinfo.util.Arith;

import java.util.Arrays;

/**
 * CPU相关信息
 * 
 * @author ruoyi
 */
public class Cpu
{
    /**
     * 核心数
     */
    private int cpuNum;

    /**
     * CPU总的使用量
     */
    private double total;

    /**
     * CPU系统使用量
     */
    private double sys;

    /**
     * CPU用户使用量
     */
    private double used;

    /**
     * CPU当前等待
     */
    private double wait;

    /**
     * CPU当前空闲
     */
    private double free;

    /**
     * 当前进程数量
     */
    private double processCount;

    /**
     * 当前线程数量
     */
    private double threadCount;

    /**
     * cpu温度
     */
    private double temperature;

    /**
     * 风扇转速
     */
    private int [] fanSpeed;

    /**
     * 电压
     */
    private double voltage;





    public int getCpuNum()
    {
        return cpuNum;
    }

    public void setCpuNum(int cpuNum)
    {
        this.cpuNum = cpuNum;
    }

    public double getTotal()
    {
        return Arith.round(total/1024, 2);
    }

    public void setTotal(double total)
    {
        this.total = total;
    }

    public double getSys()
    {
        return Arith.round(Arith.mul(sys / total, 100), 2);
    }

    public void setSys(double sys)
    {
        this.sys = sys;
    }

    public double getUsed()
    {
        return Arith.round(Arith.mul(used / total, 100), 2);
    }

    public void setUsed(double used)
    {
        this.used = used;
    }

    public double getWait()
    {
        return Arith.round(Arith.mul(wait / total, 100), 2);
    }

    public void setWait(double wait)
    {
        this.wait = wait;
    }

    public double getFree()
    {
        return Arith.round(Arith.mul(free / total, 100), 2);
    }

    public void setFree(double free)
    {
        this.free = free;
    }

    public double getProcessCount() {
        return processCount;
    }

    public void setProcessCount(double processCount) {
        this.processCount = processCount;
    }

    public double getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(double threadCount) {
        this.threadCount = threadCount;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int[] getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int[] fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "cpuNum=" + cpuNum +
                ", total=" + total +
                ", sys=" + sys +
                ", used=" + used +
                ", wait=" + wait +
                ", free=" + free +
                ", processCount=" + processCount +
                ", threadCount=" + threadCount +
                ", temperature=" + temperature +
                ", fanSpeed=" + Arrays.toString(fanSpeed) +
                ", voltage=" + voltage +
                '}';
    }
}
