package day_0425.no1;

public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("켜짐");
            }

            @Override
            public void turnOff() {
                System.out.println("꺼짐");
            }

            @Override
            public void setVolume(int volume) {
                System.out.println("볼륨설정");
            }
        };
    }
}
