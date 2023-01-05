package co.in.an.eye.tech.jms.activemq.sender.controller;

import co.in.an.eye.tech.jms.activemq.sender.service.JmsSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JmsController {

    @Autowired
    JmsSenderService jmsSenderService;

    @GetMapping("/hello/{name}")
    public String getUserName(@PathVariable String name){
        jmsSenderService.sendMessage(name);
        return "Hi - "+name;
    }
}
