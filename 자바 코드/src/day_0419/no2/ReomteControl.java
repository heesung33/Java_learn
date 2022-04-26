package day_0419.no2;

public interface ReomteControl {

    //상속
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    //디폴트 메소드
    default void seMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리합니다.");
        } else {
            System.out.println("무음해제합니다.");
        }
    }

    //정적 메소드
    static void changeBattery() {
        System.out.println("건전질르 교환합니다.");
    }
}
