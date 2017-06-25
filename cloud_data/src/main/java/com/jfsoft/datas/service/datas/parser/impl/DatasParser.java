package com.jfsoft.datas.service.datas.parser.impl;

import com.jfsoft.datas.service.datas.parser.IDatasParser;
import com.jfsoft.vo.UsualData;

/**
 * Created by root on 2017/6/25 0025.
 */
public abstract class DatasParser implements IDatasParser {

    public UsualData parseData() throws Exception {

        return parseData();
    }

    public abstract UsualData parseData(int type) throws Exception;

}
