package com.phoenix.getserverinfo.po;

/**
 * @Description: TODO(GpuInfo)
 * @Author tangbojin
 * @Date 2019/8/21 18:56
 */
public class Gpu {

    private String driverVersion;

    private String productName;

    private String performanceState;

    private String totalMem;

    public String getDriverVersion() {
        return driverVersion;
    }

    public void setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPerformanceState() {
        return performanceState;
    }

    public void setPerformanceState(String performanceState) {
        this.performanceState = performanceState;
    }

    public String getTotalMem() {
        return totalMem;
    }

    public void setTotalMem(String totalMem) {
        this.totalMem = totalMem;
    }


}
