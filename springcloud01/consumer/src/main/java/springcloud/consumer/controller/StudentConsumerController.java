package springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springcloud.springcloudapi.entity.Student;

/**
 * @Author lixin
 * @Date 2019/8/6
 * @Package springcloud.consumer.controller
 */
@RestController
public class StudentConsumerController {

    //private static final String URL="http://localhost:8001";
    private static final String URL="http://PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/student")
    public Student findById (){
        Student student = this.restTemplate.getForEntity(URL + "/student", Student.class).getBody();
        System.out.println(student);
        return student;
    }

    @RequestMapping("/consumer/discovery")
    public Object discovery(){
        Object body = this.restTemplate.getForEntity(URL + "/discovery", Object.class).getBody();
        return body;
    }
}
