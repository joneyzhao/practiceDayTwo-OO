package OOpractice;

public class Teacher extends Person {
    private String job;
    public Teacher(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public String introduce() {
//        return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a " + job +".";
        return super.introduce() + " I am a " + job +".";
    }
}
