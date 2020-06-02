package dao;

import entity.Student;

import java.util.List;

/**
 * @author WeiShiDe
 * @create 2018-04-22 12:36
 * @desc
 **/
public interface StudentMapper {
     int insertStudent(Student student) throws Exception;
     Student selectOneById(int id) throws Exception;
     List<Student> selectAllStudent();
}
