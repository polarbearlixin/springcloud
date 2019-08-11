package springcloud.provider.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springcloud.provider.mapper.StudentMapper;
import springcloud.provider.service.StudentService;
import springcloud.springcloudapi.entity.Student;

/**
 * @Author lixin
 * @Date 2019/8/6
 * @Package springcloud.provider.service.Impl
 */
@Transactional
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student findById(Integer id) {
        return this.studentMapper.findById(id);
    }

    @Override
    public Integer count() {
        return this.studentMapper.count();
    }
}
