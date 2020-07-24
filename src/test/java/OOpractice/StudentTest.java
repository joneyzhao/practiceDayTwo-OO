package OOpractice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void should_return_student_introduction_when_student_introduce_given_name_age_class(){
        Student student = new Student("Tom", 21, 2);

        String introduction = student.introduce();

        assertEquals(introduction, "My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }
}
