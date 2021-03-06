package OOpractice;

import java.util.ArrayList;
import java.util.List;

public class Klass extends KlassSubject {

    private Teacher teacher;
    private int classNumber;
    private List<Student> students = new ArrayList<Student>();

    public Klass(int classNumber){
        this.classNumber = classNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void assign(Teacher teacher){
        this.teacher = teacher;
        addObserver(teacher);

    }
    public void appendStudent(Student student){
        this.students.add(student);
        addObserver(student);
    }

    public void notifyObserver(String message){
        for(Person observer : observersList) {
            observer.receiveNotice(message);
        }
    }

}
