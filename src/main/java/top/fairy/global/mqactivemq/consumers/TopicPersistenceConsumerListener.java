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
public class TopicPersistenceConsumerListener
{
    //topic模式的消费者，持久化订阅模式
    @JmsListener(destination="${spring.activemq.topic-name}", containerFactory="topicPercistenceListener")
    public void readActiveQueue(String message) {
        System.out.println("topic接受:持久化订阅：" + message);
    }
}