package com.jfsoft.datas.inf;

import com.jfsoft.datas.service.datas.processor.CloudStoreDataProcessor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by root on 2017/6/25 0025.
 */
public class CloudStoreDataInf extends DatasProcessor {

    @Autowired
    private CloudStoreDataProcessor cloudStoreDataProcessor;

    protected void processCore(String mainType) {
        dealSingleData(mainType);
    }

    private void dealSingleData(String mainType) {
        cloudStoreDataProcessor.doProcessData(String mainType);
    }

}
