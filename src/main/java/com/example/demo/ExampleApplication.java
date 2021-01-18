package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import xyz.erupt.core.annotation.EruptScan;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
@ComponentScan({"xyz.erupt", "com.example.demo"}) // ↓ xyz.erupt必须有
@EntityScan({"xyz.erupt", "com.example.demo"})    // ↓ 如果包名com.example.demo有变化
@EruptScan({"xyz.erupt", "com.example.demo"})     // → 要修改为变化后的包名
public class ExampleApplication {

    public static void main(String[] args) throws URISyntaxException, IOException {
        SpringApplication.run(ExampleApplication.class, args);
        System.setProperty("java.awt.headless", "false");
        Desktop.getDesktop().browse(new URI("http://localhost:8080"));
    }

}
