package com.jfsoft.datas.inf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanggang on 2017/6/25 0025.
 */
public abstract class DatasProcessor {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public void process(String mainType) {

        logger.debug("解析数据");

        //数据验证

        //数据处理
        processCore(mainType);

    }

    protected abstract void processCore(String mainType);

}
