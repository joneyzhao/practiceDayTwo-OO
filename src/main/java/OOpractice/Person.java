package OOpractice;

public class Person {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    public String receiveNotice(String message){
        System.out.println("我是"+ this.name + "收到通知为：" + message);
        return message;
    }
}
