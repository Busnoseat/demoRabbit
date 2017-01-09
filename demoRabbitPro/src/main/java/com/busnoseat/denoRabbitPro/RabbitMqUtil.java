package com.busnoseat.denoRabbitPro;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;

/**
 * The type RabbitMqUtil.
 *
 * @author xubo
 * @Description:
 * @Date 2017/1/9
 */
public class RabbitMqUtil {
    /**
     * 像rabbit里发送消息
     * @param rountKey
     * @param data
     */
    public static void sendDate(String rountKey,Object data){
        try {
            AmqpTemplate amqpTemplate= SpringContextUtils.getBean("amqpTemplate");
            amqpTemplate.convertAndSend(rountKey,data);
            System.out.println("RabbitMqUtil成功发送消息:"+data);
        } catch (AmqpException e) {
            System.out.println(e);
        }
    }
}
