package springcloud.providerhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard//监控
@EnableEurekaClient  //客户端
public class ProviderhystrixdashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderhystrixdashboardApplication.class, args);
    }

}
