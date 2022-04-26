package day_0426.no1;

public class Teacher extends Person {

    String[] studentName;

    public Teacher(String name, String[] studentName) {
        super(String.valueOf(studentName));
        this.studentName = studentName;
        this.name = name;
    }

    public void teach() {
        System.out.println("공부 가르치기");
    }
}
