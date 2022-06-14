package day_0613.no3;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<Student, Integer>();

        map.put(new Student(1, "자바킴"), 95);
        map.put(new Student(1, "홍길동"), 100);

        System.out.println("총 Entry 수 :" + map.size());
    }

}
