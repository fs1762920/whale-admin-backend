package cn.fan.whale.service;

import com.alibaba.fastjson2.JSONObject;

import java.net.UnknownHostException;
import java.util.Date;

public interface SystemService {

    JSONObject getServerInfo() throws UnknownHostException;

    JSONObject getCPUInfo(Date startDateTime, Date endDateTime);

    JSONObject getMemoInfo(Date startDateTime, Date endDateTime);
}
