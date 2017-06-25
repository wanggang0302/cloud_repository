package com.jfsoft.core.util;

/**
 * Created by root on 2017/6/25 0025.
 * 常量类
 */
public class Constants {

    /**
     * 云平台存储数据类型
     */
    public enum DataType {

        LIS("1"),//检验系统
        PEIS("2"),//体检系统
        COMMON("3");//通用类消息

        private String value;

        private DataType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

}
