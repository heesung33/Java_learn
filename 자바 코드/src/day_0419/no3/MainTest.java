package day_0419.no3;

public class MainTest {

    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Audio();

        rc.turnOn();
        rc.turnOff();
        rc.setVolume(8);
        rc.setVolume(20);
    }
}
