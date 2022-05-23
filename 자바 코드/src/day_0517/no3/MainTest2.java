package day_0517.no3;

public class MainTest2 {

    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("userHome");

        System.out.println("운영체제 이름 : " + osName);
        System.out.println("사용자 이름 : "+ userName );
        System.out.println("사용자 홈디렉토리 : " + userHome);
    }
}
