package day_0419.no4;

public class MainTest {

    public static void main(String[] args) {
        //day_0419.no4.Phone phone = new day_0419.no4.Phone();

        SmartPhone smartPhone = new SmartPhone("홍길동");

        //Phone의 메소드
        smartPhone.turnOn();
        smartPhone.turnOff();

        smartPhone.internetSearch();
    }
}
