package springcloud.springcloudapi.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import springcloud.springcloudapi.entity.Student;
import springcloud.springcloudapi.service.StudentClientService;

/**
 * @Author lixin
 * @Date 2019/8/11
 * @Package springcloud.springcloudapi.fallback
 */
@Component//千万不要忘记
public class StudentClientServiceFallback implements FallbackFactory<StudentClientService> {

    @Override
    public StudentClientService create(Throwable throwable) {
        return new StudentClientService() {
            @Override
            public Student findById() {
                return new Student().setStuId(1).setStuName("该id:"+1+"没有对应信息!!!");
            }

            @Override
            public Integer count() {
                return 0;
            }
        };
    }
}
