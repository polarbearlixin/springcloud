package springcloud.providerhystrix.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import springcloud.springcloudapi.entity.Student;

/**
 * @Author lixin
 * @Date 2019/8/6
 * @Package springcloud.provider.mapper
 */
@Repository
public interface StudentMapper {


    //boolean addStudent(Student student);
    @Results(id ="student",value = {
            @Result(id = true,column = "stu_id",property = "stuId"),
            @Result(column = "stu_name",property = "stuName"),
            @Result(column = "class_id",property = "classId"),
            @Result(column = "stu_sex",property = "stuSex"),
            @Result(column = "stu_birthday",property = "stuBirthday")
    })
    @Select("select * from student where stu_id = #{stuId}")
    Student findById(@Param("stuId") Integer id);

    //List<Student>findAll();

    @Select("select count(*) from student")
    Integer count();
}
