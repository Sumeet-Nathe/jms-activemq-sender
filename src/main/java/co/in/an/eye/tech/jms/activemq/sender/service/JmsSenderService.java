package co.in.an.eye.tech.jms.activemq.sender.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JmsSenderService {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${jms.queue.name}")
    String queName;

    public void sendMessage(String message){
        jmsTemplate.convertAndSend(queName,message);
    }
}
