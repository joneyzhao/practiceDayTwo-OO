package OOpractice;

public class Student extends Person {
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce() {
        return super.introduce() + " I am a Student of Class "+ klass.getClassNumber() + ".";
    }

    public void changeName(String newName){
        super.setName(newName);
        String message = introduce();
        klass.notifyObserver(message);
    }
}


//
//public class Student {
//    private Person person;
//    private int classNum;
//
////    public Student(Person person, int classNum) {
////        this.person = person;
////        this.classNum = classNum;
////    }
//    //聚合关系
//
//    public Student(String name, int age, int classNum) {
//        this.person = new Person(name, age);
//        this.classNum = classNum;
//    }
//    //组合关系：同声同死
//
//    public String introduce() {
//        return person.introduce() + " I am a Student of Class "+ classNum + ".";
//    }
//}