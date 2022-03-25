package day12;
import java.util.*;
public class Hash {

    public static void main(String[] args) {
        Map<String,Student> hm = new java.util.HashMap<>();
        hm.put("Haryana",new Student(20,"Aarti",100));
        hm.put("Pune",new Student(50,"Goldy",90));
        hm.put("Rohtak",new Student(80,"Himanshi",90));
        hm.put("Kurukshetra",new Student(5,"Nidhi",80));
        hm.put("Lakhnow",new Student(10,"Priya",99));

        Set<Map.Entry<String,Student>> hm1 =hm.entrySet();

        List<Map.Entry<String,Student>> ls = new ArrayList<>(hm1);

        Collections.sort(ls, new CompareAccMarks());

        for(Map.Entry<String,Student> m:ls){
            System.out.println("State is "+m.getKey());
            System.out.println(m.getValue());

        }






    }
}
