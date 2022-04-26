package day_0426.no1;

public class Student extends Person {

    int classNumber;

    public Student(String name, int classNumber) {
        super(String.valueOf(classNumber));
        this.name = name;
        this.classNumber = classNumber;

    }

    @Override
    public void breath() {
        System.out.println("학생이 숨을 쉽니다");
    }

    public void study() {
        System.out.println("공부중");
    }

    public void study(String subject) {
        System.out.println("제일 좋아하는" + subject + "공부중");
    }


}
