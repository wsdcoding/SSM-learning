


import dao.StudentMapper;
import entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {//mybatis脱离spring学习
        InputStream in = Main.class.getResourceAsStream("resource/mybatis-cfg.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setId(5);
        student.setAge(5);
        student.setName("weishide");
        student.setSex("nan");
        student.settId(5);
       student= mapper.selectOneById(5);
 //        List<Student> studentList =  mapper.selectAllStudent();
        session.commit();
        session.close();
    }
}
