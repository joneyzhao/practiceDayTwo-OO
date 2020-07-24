package OOpractice;

//public class Student extends Person {
//    private int classNum;
//
//    public Student(String name, int age, int classNum) {
//        super(name, age);
//        this.classNum = classNum;
//    }
//
//    public String introduce() {
//        return super.introduce() + " I am a Student of Class "+ classNum + ".";
//    }
//}



public class Student {
    private Person person;
    private int classNum;

//    public Student(Person person, int classNum) {
//        this.person = person;
//        this.classNum = classNum;
//    }
    //聚合关系

    public Student(String name, int age, int classNum) {
        this.person = new Person(name, age);
        this.classNum = classNum;
    }
    //组合关系：同声同死

    public String introduce() {
        return person.introduce() + " I am a Student of Class "+ classNum + ".";
    }
}