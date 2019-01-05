import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Data
@AllArgsConstructor
public class University {

    public static void main(String[] args) {
       // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("beanDef.xml");
        Student student = (Student) context.getBean("student:name");
        student.getInfo();

        Teacher teacher = (Teacher)context.getBean("teacher-alias");
        teacher.getTeacherInfo();

        TeacherList teacherList = (TeacherList) context.getBean("teacherList");
        teacherList.getListInfo();

    }
}
