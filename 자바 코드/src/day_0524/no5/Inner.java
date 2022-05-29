package day_0524.no5;

public class Inner {
    void method(int arg) {
        int local = 10;

        // arg = 5;
        // local = 5;
        B b = ()-> {
            // arg = 5;
            // local = 5;

            System.out.println(arg);
            System.out.println(local);
        };
        b.run();
    }
}
