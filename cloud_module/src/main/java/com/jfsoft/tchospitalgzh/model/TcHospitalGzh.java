/**
 * TcHospitalGzh.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-06-26 Created
 */
package com.jfsoft.tchospitalgzh.model;

/**
 * null
 * 
 * @author wanggang
 * @version 1.0 2017-06-26
 */
public class TcHospitalGzh {

    /**
     */
    private Integer id;

    /**
     * 医院编码
     */
    private String hospitalCode;

    /**
     * 医院公众号ID
     */
    private String appid;

    /**
     * 医院公众号密匙
     */
    private String appsecret;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

}
