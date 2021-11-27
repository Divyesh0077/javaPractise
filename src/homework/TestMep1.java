package Mep;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMep1 {

    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();

        myMap.put(" Firstname","divyesh");
        myMap.put("Lastname","savaliya");
        myMap.put("subject","Java");

        System.out.println(myMap);
        System.out.println(myMap.size());

        System.out.println(myMap.get("firsttname"));

        Set<String> keys=myMap.keySet();

        for (String key: myMap.keySet()){
            System.out.println("key  > "+key+"value is >"+myMap.get(""));


        }
    }


}
