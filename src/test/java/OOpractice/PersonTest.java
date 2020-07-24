package OOpractice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void should_return_introduction_when_introduce_given_name_and_age(){
        //given
        Person person = new Person("Tom", 21);
        //when
        String introduction = person.introduce();
        //then
        assertEquals(introduction, "My name is Tom. I am 21 years old.");
    }
}
