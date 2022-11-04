package io.shulie.chaosbladedemo.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * 监听rocketmq主题的消息
 *
 * @author sanyou
 * @date 2022/8/14 19:29
 */
@Component
@RocketMQMessageListener(consumerGroup = "drilling-group", topic = "test_chaos")
public class SanYouTopicListener implements RocketMQListener<String> {

    @Override
    public void onMessage(String msg) {
        System.out.println("处理消息:" + msg);
    }

}