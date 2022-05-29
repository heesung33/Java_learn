package day_0524.no3;

public class A {
    public static void main(String[] args) {
        Out o = new Out();
        Out.Inner i = o.new Inner();
        i.method();
    }
}
