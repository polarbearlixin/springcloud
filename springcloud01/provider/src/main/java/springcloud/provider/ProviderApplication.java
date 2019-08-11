package springcloud.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@MapperScan(value = {"springcloud.provider.mapper"})
@EnableEurekaClient  //客户端
@EnableDiscoveryClient //服务发现
//@ComponentScan(basePackages = {"springcloud.provider","springcloud.springcloudapi"})
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
