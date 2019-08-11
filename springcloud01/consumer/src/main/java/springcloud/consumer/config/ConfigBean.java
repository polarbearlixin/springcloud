package springcloud.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Author lixin
 * @Date 2019/8/6
 * @Package springcloud.consumer.config
 */
@Component
@Configuration //boot -->spring
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate1(){
        return new RestTemplate();//默认是轮训算法
    }

    @Bean
    public IRule myRule(){
        //return new RandomRule();//随机算法
        return new RetryRule();
    }
}
