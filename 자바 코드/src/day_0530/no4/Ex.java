package day_0530.no4;

public class Ex {

    public static <T extends A> void a(T t) {
        t.a();
        //t.b();
    }

    public static void main(String[] args) {
        a(new A());
        a(new B());
    }

}
