package day_0426.no1;


public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void breath() {
        System.out.println("숨을 쉽니다");
    }

    public void use(ClassRoom classRoom) {
        System.out.println(classRoom.classNumber + "반을 사용하다.");
    }

}
