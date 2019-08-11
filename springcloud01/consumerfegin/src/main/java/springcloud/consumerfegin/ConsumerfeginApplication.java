package springcloud.consumerfegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"springcloud"})
@EnableFeignClients(basePackages = {"springcloud"})
public class ConsumerfeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerfeginApplication.class, args);
    }
}
