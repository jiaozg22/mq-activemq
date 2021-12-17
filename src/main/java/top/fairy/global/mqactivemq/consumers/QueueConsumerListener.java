package top.fairy.global.mqactivemq.consumers;

/**
 * @ClassName: QueueConsumerListener
 * @Description:
 * @Author: jiaozongguan
 * @Date: 2021/12/16 18:05
 */
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumerListener
{
    //queue模式的消费者
    @JmsListener(destination="${spring.activemq.queue-name}", containerFactory="queueListener")
    public void readActiveQueue(String message) {
        System.out.println("queue接受到：" + message);
    }
}