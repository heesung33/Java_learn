package day_0517.no3;

public class MainTest3 {

    public static void main(String[] args) {
        String name = System.getenv("os");
        System.out.println("OS" + name);

        String name2 = System.getenv("path");
        System.out.println("path : " + name2);
    }
}
