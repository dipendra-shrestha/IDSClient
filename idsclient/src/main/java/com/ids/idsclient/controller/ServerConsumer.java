package com.ids.idsclient.controller;

import com.ids.idsclient.model.Greeting;
import com.ids.idsclient.model.Postbox;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServerConsumer {

    @RequestMapping(value = "/checkpost")
    public Postbox greeting(@RequestParam(value="name", defaultValue="World") String name) {

        Postbox postbox = new RestTemplate().getForObject("http://localhost:9090/checkServerPost",Postbox.class);

        return postbox;
    }
}
