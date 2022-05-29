package day_0524.no3;

public class Out {
    int out = 10;
    class Inner {
        int in = 5;

        void method() {
            int out = 1;
            int in = 2;
            B b = () -> {
                System.out.println(this.in);
                System.out.println(Out.this.out);
                System.out.println(out  );
            };
            b.run();
        }
    }
}
