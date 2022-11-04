package io.shulie.chaosbladedemo.service;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

import java.nio.charset.StandardCharsets;

/**
 * 生产者
 *
 * @author sanyou
 * @date 2022/8/14 12:40
 */
public class Producer {


    public static void produceMessage() throws Exception {
        //创建一个生产者，指定生产者组为sanyouProducer
        DefaultMQProducer producer = new DefaultMQProducer("drilling-group");

        // 指定NameServer的地址
        producer.setNamesrvAddr("192.168.1.151:9876");
        // 第一次发送可能会超时，我设置的比较大
        producer.setSendMsgTimeout(60000);

        // 启动生产者
        producer.start();
        //创建一条消息
        // topic为 sanyouTopic
        // 消息内容为 三友的java日记
        // tags 为 TagA

        try {
            Message msg = new Message("test_chaos", "tag1", "chaosblade 测试".getBytes(StandardCharsets.UTF_8));
            // 发送消息并得到消息的发送结果，然后打印
            SendResult sendResult = producer.send(msg);
            System.out.printf("%s%n", sendResult);
        } finally {
            // 关闭生产者
            producer.shutdown();
        }


    }

}
