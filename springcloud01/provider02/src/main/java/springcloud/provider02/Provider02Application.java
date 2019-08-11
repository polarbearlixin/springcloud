package springcloud.provider02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("springcloud.provider02.mapper")
@EnableEurekaClient  //客户端
@EnableDiscoveryClient //服务发现
public class Provider02Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider02Application.class, args);
    }

}
