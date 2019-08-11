package springcloud.provider.service;

import springcloud.springcloudapi.entity.Student;

/**
 * @Author lixin
 * @Date 2019/8/6
 * @Package springcloud.provider.service
 */
public interface StudentService {
    Student findById(Integer id);
    Integer count();
}
