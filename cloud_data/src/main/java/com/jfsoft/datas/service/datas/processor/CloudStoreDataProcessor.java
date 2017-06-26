package com.jfsoft.datas.service.datas.processor;

import com.jfsoft.datas.service.ICloudDataStoreService;
import com.jfsoft.datas.service.datas.parser.IDatasParser;
import com.jfsoft.datas.service.datas.parser.StoreDataParserFactory;
import com.jfsoft.vo.UsualData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by root on 2017/6/25 0025.
 */
@Component
public class CloudStoreDataProcessor {

    @Autowired
    private ICloudDataStoreService cloudDataStoreService;
    @Autowired
    private StoreDataParserFactory storeDataParserFactory;

    public void doProcessData(String mainType) throws Exception {

        IDatasParser parser = storeDataParserFactory.create(mainType);

        UsualData usualData = parser.parseData();


    }

}
