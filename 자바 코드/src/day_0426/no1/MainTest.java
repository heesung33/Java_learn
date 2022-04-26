package day_0426.no1;

public class MainTest {

    public static void main(String[] args) {

        Person person = new Person("영동이");
        Student student = new Student("영동이", 2414);
        Teacher teacher = new Teacher("영동이", new String[]{"일동이", "이동이", "삼동이"});

        person.breath();
        person.use(new ClassRoom(4, new Chair(1)));

        student.breath();
        student.study();
        student.study("자바");

        teacher.teach();

    }
}
