package OOpractice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class KlassTest {

    @Test
    public void should_return_klass_number_when_getNumber(){
        Klass klass = new Klass(2);
        int num = klass.getClassNumber();

        assertEquals(num, 2);
    }

    @Test
    public void should_return_klass_teacher_when_assign_teacher(){
        Teacher teacher = new Teacher("Matt", 30, "Teacher");
        Klass klass = new Klass(2);
        klass.assign(teacher);

        assertEquals(klass.getTeacher(), teacher);
    }

    @Test
    public void should_return_klass_students_when_append_student(){
        Klass klass = new Klass(2);
        Student studentOne = new Student("Tom", 21, klass);
        klass.appendStudent(studentOne);

        assertEquals(klass.getStudents().size(), 1);
        assertEquals(klass.getStudents().get(0), studentOne);
    }

    @Test
    public void should_notice_message_when_Klass_notice_given_student_name_change(){
        Klass klass = new Klass(2);
        Teacher teacher = new Teacher("Shaly", 30, "Teacher");
        Student studentOne = new Student("Tom", 21, klass);
        Student studentTwo = new Student("Bob", 20, klass);
        klass.assign(teacher);
        klass.appendStudent(studentOne);
        klass.appendStudent(studentTwo);

        studentOne.changeName("TomFord");

        assertEquals(klass.getStudents().size(), 2);
        assertEquals(klass.getStudents().get(0), studentOne);
        assertEquals(klass.getTeacher(), teacher);
    }


    @Test
    public void should_notice_message_when_Klass_notice_given_student_klass_change(){
        Klass klass = new Klass(2);
        Teacher teacher = new Teacher("Shaly", 30, "Teacher");
        Student studentOne = new Student("Tom", 21, klass);
        Student studentTwo = new Student("Bob", 20, klass);
        klass.assign(teacher);
        klass.appendStudent(studentOne);
        klass.appendStudent(studentTwo);

        Klass klass1 = new Klass(1);
        Teacher teacher1 = new Teacher("FeeDe", 30, "Teacher");
        Student student1One = new Student("Meni", 19, klass);
        Student student1Two = new Student("Bule", 20, klass);
        klass1.assign(teacher1);
        klass1.appendStudent(student1One);
        klass1.appendStudent(student1Two);

        studentOne.changeKlass(klass1);
    }
}
