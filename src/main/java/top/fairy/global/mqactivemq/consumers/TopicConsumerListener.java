package top.fairy.global.mqactivemq.consumers;

/**
 * @ClassName: TopicConsumerListener
 * @Description:
 * @Author: Datasure008
 * @Date: 2021/12/16 18:19
 */
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicConsumerListener
{
    //topic模式的消费者，普通订阅模式
    @JmsListener(destination="${spring.activemq.topic-name}", containerFactory="topicListener")
    public void readActiveQueue(String message) {
        System.out.println("topic接受到：" + message);
    }
}