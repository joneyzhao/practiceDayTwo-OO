package OOpractice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {
    @Test
    public void should_return_teacher_introduction_when_teacher_introduce_given_name_age_job(){
        Teacher teacher = new Teacher("Matt", 30, "Teacher");

        String introduction = teacher.introduce();

        assertEquals(introduction, "My name is Matt. I am 30 years old. I am a Teacher.");
    }
}
