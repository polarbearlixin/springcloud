package springcloud.providerhystrix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@MapperScan(value = {"springcloud.providerhystrix.mapper"})
@EnableEurekaClient  //客户端
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker//对熔断器进行支持
public class ProviderhystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderhystrixApplication.class, args);
    }

}
