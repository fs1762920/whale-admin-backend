package cn.fan.whale.scheduler;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class ResourceScheduler {

    private final MongoTemplate mongoTemplate;

    public ResourceScheduler(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void saveResourceUsedCase() {
        // 获取当前CPU使用率

        // 获取当前内存使用率

    }
}
