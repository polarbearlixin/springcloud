package springcloud.server02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //表示EurekaServer服务器启动类，接受其他服务注册进来
public class Server02Application {

    public static void main(String[] args) {
        SpringApplication.run(Server02Application.class, args);
    }

}
