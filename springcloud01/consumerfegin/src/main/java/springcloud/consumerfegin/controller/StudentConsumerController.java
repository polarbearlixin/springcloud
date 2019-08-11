package springcloud.consumerfegin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.springcloudapi.entity.Student;
import springcloud.springcloudapi.service.StudentClientService;

/**
 * @Author lixin
 * @Date 2019/8/6
 * @Package springcloud.consumer.controller
 */
@RestController
public class StudentConsumerController {

    @Autowired
    private StudentClientService service;

    @RequestMapping("/consumer/student")
    public Student findById(){
        Student student = this.service.findById();
        if (null==student){
            throw new NullPointerException("控制郑");
        }
        System.out.println(student);
        return student;
    }

}
