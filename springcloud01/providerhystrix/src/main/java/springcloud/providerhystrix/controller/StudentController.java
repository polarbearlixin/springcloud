package springcloud.providerhystrix.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.providerhystrix.service.StudentService;
import springcloud.springcloudapi.entity.Student;

import java.util.List;

/**
 * @Author lixin
 * @Date 2019/8/6
 * @Package springcloud.provider.controller
 */
@RestController
public class StudentController {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentService studentService;

    @Autowired
    private DiscoveryClient client;//发现

    @RequestMapping("/student")
    //@HystrixCommand(fallbackMethod = "processHystrix")//如果出现异常，调用的方法processHystrix
    public Student findById(){
        logger.debug("1");
        return this.studentService.findById(1);

    }

    public Student processHystrix(){
        return new Student().setStuId(1).setStuName("该id:"+1+"没有对应信息!!!");
    }

    @RequestMapping("/count")
    public Integer count(){
        Integer count = this.studentService.count();
        logger.warn(count+"");
        return count;
    }

    @RequestMapping("/discovery")
    public Object discovery(){
        List<String> services = client.getServices();
        System.out.println("**********************"+services);
        List<ServiceInstance> instances = client.getInstances("provider".toUpperCase());
        for (ServiceInstance element:instances){
            System.out.println(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort()+"\t"+element.getUri());
        }
        return this.client;
    }

}
