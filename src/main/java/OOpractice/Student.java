package OOpractice;

public class Student extends Person {
    private int classNum;

    public Student(String name, int age, int classNum) {
        super(name, age);
        this.classNum = classNum;
    }

    public String introduce() {
        return super.introduce() + " I am a Student of Class "+ classNum + ".";
    }
}
