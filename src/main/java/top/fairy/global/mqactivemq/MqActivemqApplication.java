package top.fairy.global.mqactivemq;

/**
 * @Title:
 * @param 参考：https://www.cnblogs.com/yufeng218/p/11509486.html
 * @Description: 方法
 * @Author:  jiaozongguan
 * @Version:  1.0
 * @Date:  2021/12/16 18:17
 * @Parameters:
 * @Return
 * @Throws
 * */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.jms.annotation.EnableJms;


@SpringBootApplication
@EnableEurekaClient
@EnableJms    //启动消息队列
public class MqActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqActivemqApplication.class, args);
	}

}
