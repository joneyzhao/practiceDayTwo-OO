package OOpractice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void should_return_student_introduction_when_student_introduce_given_name_age_class(){
        Klass klass = new Klass(2);
        Student student = new Student("Tom", 21, klass);

        String introduction = student.introduce();

        assertEquals(introduction, "My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }

//    @Test
//    public void should_return_student_introduction_when_student_introduce_given_person_class(){
//        Person person = new Person("Tom", 21);
//        Student student = new Student(person, 2);
//
//        String introduction = student.introduce();
//
//        assertEquals(introduction, "My name is Tom. I am 21 years old. I am a Student of Class 2.");
//    }
}
