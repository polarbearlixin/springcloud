package springcloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lixin
 * @Date 2019/8/8
 * @Package springcloud.myrule
 */
@Configuration
public class MyRule {

    @Bean
    public IRule getIRule(){
        return new RandomRule();
    }
}
