package com.myblog.service.impl;

import com.myblog.service.IMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Zephery
 * Time: 2017/10/3 11:56
 * Description:消息队列
 */
@Service("messageService")
public class MessageServiceImpl implements IMessageService {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);
//    @Resource
//    private AmqpTemplate amqpTemplate;

    public void pushToMessageQueue(String routingKey, String message) {
//        amqpTemplate.convertAndSend(routingKey, message);
//        logger.info("成功插入消息 " + message);
    }

    public void popMessage(String destinationQueueName) {
//        Message message = amqpTemplate.receive(destinationQueueName);
//        logger.info("成功取出消息 " + new String(message.getBody()));
    }
}