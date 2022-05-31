package day_0530.no1;

public class BoxEx {

    public static void main(String[] args) {
        Box box = new Box();
        box.setObj("홍길동");
        String name = (String)box.getObj();

        box.setObj(new Apple());
        Apple apple = (Apple) box.getObj();
    }
}
