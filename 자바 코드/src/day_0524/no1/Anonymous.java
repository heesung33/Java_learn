package day_0524.no1;

public class Anonymous {
    //필드 초기값으로 대입
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다");
        }
    };

}
