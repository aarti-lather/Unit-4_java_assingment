package day12;
import java.util.*;
public class LinkedHashMap {


    public static void main(String[] args) {
        Map<String,String> mss = new java.util.LinkedHashMap<>();
        mss.put("Haryana","Chandigarh");
        mss.put("Jammu-Kismir","Shrinagar");
        mss.put("Bihar","Patna");
        mss.put("Punjab","Chandigarh");
        mss.put("WestBengal","Kolkata");

        Set<Map.Entry<String,String>> set =mss.entrySet();


        for(Map.Entry<String,String> me:set){
            System.out.println(me.getKey()+"-->"+me.getValue());
        }

    }
}
