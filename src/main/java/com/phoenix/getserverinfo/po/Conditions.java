package com.phoenix.getserverinfo.po;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author tangbojin
 * @Date 2019/9/10 11:03
 */
public class Conditions {

    public String logLevel;

    public String startTime;

    public String endTime;

    public String taskId;

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}
