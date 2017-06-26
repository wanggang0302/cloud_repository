package com.jfsoft.datas.service.datas.parser;

import com.jfsoft.core.util.Constants;
import com.jfsoft.datas.service.datas.parser.store.CloudCommonDataParser;
import com.jfsoft.datas.service.datas.parser.store.CloudLisDataParser;
import com.jfsoft.datas.service.datas.parser.store.CloudPeisDataParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by root on 2017/6/25 0025.
 * 云平台存储数据解析类，工厂类
 */
@Component
public class StoreDataParserFactory {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CloudCommonDataParser cloudCommonDataParser;
    @Autowired
    private CloudLisDataParser cloudLisDataParser;
    @Autowired
    private CloudPeisDataParser cloudPeisDataParser;

    public IDatasParser create(String mainType) {

        if(Constants.DataType.LIS.equals(mainType)) {
            return cloudLisDataParser;
        } else if(Constants.DataType.PEIS.equals(mainType)) {
            return cloudPeisDataParser;
        } else if(Constants.DataType.COMMON.equals(mainType)) {
            return cloudCommonDataParser;
        }

        logger.error("没有找到对应的数据处理器！");
        return null;
    }

}
