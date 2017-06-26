package com.jfsoft.tclog.service.impl;

import com.jfsoft.tclog.mapper.TcLogMapper;
import com.jfsoft.tclog.model.TcLog;
import com.jfsoft.tclog.service.ITcLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by web on 2017/6/26.
 */
@Service("tcLogService")
public class TcLogServiceImpl implements ITcLogService {

    @Autowired
    private TcLogMapper tcLogMapper;

    /**
     * 日志插入
     * @param tcLog
     * @return
     */
    public Integer insertSysLog(TcLog tcLog) {
        return tcLogMapper.insertSelective(tcLog);
    }

}
