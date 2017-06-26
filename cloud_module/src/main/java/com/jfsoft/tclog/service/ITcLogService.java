package com.jfsoft.tclog.service;

import com.jfsoft.tclog.model.TcLog;

/**
 * Created by web on 2017/6/26.
 * TODO(保存日志接口)
 */
public interface ITcLogService {
    /**
     * 插入日志
     * @param tcLog
     * @return
     */
    Integer insertSysLog(TcLog tcLog);

}
