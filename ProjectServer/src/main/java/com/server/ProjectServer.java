package com.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//注册服务
@EnableEurekaServer
public class ProjectServer {
    public static void main(String[] args) {
        SpringApplication.run(ProjectServer.class,args);
    }
}
