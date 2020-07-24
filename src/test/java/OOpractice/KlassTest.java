package OOpractice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
