package springcloud.springcloudapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import springcloud.springcloudapi.entity.Student;
import springcloud.springcloudapi.fallback.StudentClientServiceFallback;

/**
 * @Author lixin
 * @Date 2019/8/8
 * @Package springcloud.springcloudapi.service
 */
@FeignClient(name = "provider",fallbackFactory = StudentClientServiceFallback.class)
public interface StudentClientService {

    @RequestMapping("/consumer/student")
    Student findById();

    @RequestMapping("/consumer/count")
    Integer count();
}
