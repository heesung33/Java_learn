package day_0524.no4;


public class A {
    public static void main(String[] args) {
        Out o = new Out();
        Out.Inner i = o.new Inner();
        i.method();
    }
}
