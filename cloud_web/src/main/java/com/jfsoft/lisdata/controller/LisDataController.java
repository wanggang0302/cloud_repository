package com.jfsoft.lisdata.controller;

import com.jfsoft.tclog.model.TcLog;
import com.jfsoft.tclog.service.ITcLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenXc
 * @version V1.0
 * @Date 2017/6/26  13:01
 * @Description TODO(一句话描述类作用)
 */
@RestController
@RequestMapping("/lis")
public class LisDataController {

    @Autowired
    private ITcLogService tcLogService;

    @RequestMapping(method = RequestMethod.POST)
    public HttpEntity lisData(@RequestParam("upMechCode") String upMechCode,@RequestParam("upMechName") String upMechName){
        TcLog tcLog = new TcLog();
        tcLog.setUpMechCode(upMechCode);
        tcLogService.insertSysLog(tcLog);
        return new ResponseEntity<>(tcLog, HttpStatus.OK);
    }
}
