package top.fairy.global.mqactivemq.producers;

/**
 * @ClassName: ProducerController
 * @Description:
 * @Author: jiaozongguan
 * @Date: 2021/12/16 17:48
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

@RestController
@RequestMapping("/activemq")
public class ProducerController
{
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;


    /*
     * @ClassName ASayHelloController
     * @Desc TODO   Say Hello
     * @Date 2019/5/20 23:24
     * @Version 1.0
     */
    @RequestMapping("/hello")
    public String hello() {
        return "Hello！I'm a. port：" + 8081;

    }

    @RequestMapping(value = "/queue/test",method = RequestMethod.POST)
    public String sendQueue(@RequestBody String str) {
        this.sendMessage(this.queue, str);
        return "success";
    }

    @RequestMapping(value = "/topic/test",method = RequestMethod.POST)
    public String sendTopic(@RequestBody String str) {
        this.sendMessage(this.topic, str);
        return "success";
    }

    // 发送消息，destination是发送到的队列，message是待发送的消息
    private void sendMessage(Destination destination, final String message){
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}