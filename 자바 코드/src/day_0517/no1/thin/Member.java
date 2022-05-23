package day_0517.no1.thin;

public class Member implements Cloneable{
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public Member(String id, String name, String password, int age, boolean adult){
        this.id = id;
        this.name = name;
        this.password = password;
        this.adult = adult;
        this.age = age;
    }

    public Member getMember() {
        Member cloned = null;

        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {}
        return cloned;
    }
}
