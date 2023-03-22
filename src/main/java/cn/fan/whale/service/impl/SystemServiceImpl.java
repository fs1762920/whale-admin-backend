package cn.fan.whale.service.impl;

import cn.fan.whale.service.SystemService;
import com.alibaba.fastjson2.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

@Service
@Slf4j
public class SystemServiceImpl implements SystemService {

    private final MongoTemplate mongoTemplate;

    public SystemServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public JSONObject getServerInfo() throws UnknownHostException {
        // 获取系统信息
        Properties sysProps = System.getProperties();
        Map<String, String> env = System.getenv();
        String serverName = env.get("COMPUTERNAME");
        String systemName = sysProps.getProperty("os.name");
        String arch = sysProps.getProperty("os.arch");
        InetAddress address = InetAddress.getLocalHost();
        String ip = address.getHostAddress();
        JSONObject sysInfo = new JSONObject();
        sysInfo.put("serverName", serverName);
        sysInfo.put("systemName", systemName);
        sysInfo.put("arch", arch);
        sysInfo.put("ip", ip);
        // 获取jvm信息
        String javaVersion = sysProps.getProperty("java.version");
        String jvmName = sysProps.getProperty("java.vm.name");
        String workDir = sysProps.getProperty("user.dir");
        String javaHome = sysProps.getProperty("java.home");
        JSONObject jvmInfo = new JSONObject();
        jvmInfo.put("javaVersion", javaVersion);
        jvmInfo.put("jvmName", jvmName);
        jvmInfo.put("workDir", workDir);
        jvmInfo.put("javaHome", javaHome);
        JSONObject result = new JSONObject();
        result.put("sysInfo", sysInfo);
        result.put("jvmInfo", jvmInfo);
        return result;
    }

    @Override
    public JSONObject getCPUInfo(Date startDateTime, Date endDateTime) {
        return null;
    }

    @Override
    public JSONObject getMemoInfo(Date startDateTime, Date endDateTime) {
        return null;
    }
}
