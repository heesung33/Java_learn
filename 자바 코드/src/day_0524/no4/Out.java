package day_0524.no4;

public class Out {
    int out = 10;
    class Inner {
        int in = 5;

        void method() {
            B b = () -> {
                int in =100;
                int out = 101;
                System.out.println(this.in);
                System.out.println(Out.this.out);
                System.out.println(out);
            };
            b.run();
        }
    }
}
