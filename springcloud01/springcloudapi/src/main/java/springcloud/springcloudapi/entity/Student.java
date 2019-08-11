package springcloud.springcloudapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author lixin
 * @Date 2019/8/6
 * @Package springcloud.springcloudapi.entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)//表示链式写法
public class Student implements Serializable {
    private Integer stuId;
    private Integer classId;
    private String stuName;
    private Integer stuSex;
    private Date stuBirthday;

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", classId=" + classId +
                ", stuName='" + stuName + '\'' +
                ", stuSex=" + stuSex +
                ", stuBirthday=" + stuBirthday +
                '}';
    }
}
