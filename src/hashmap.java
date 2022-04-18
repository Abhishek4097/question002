

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    //convert this program into oop
    public static void main(String[] args) {
        HashMap<String,Integer> obj=new HashMap<>();
        for (Map.Entry<String,Integer>res:obj.entrySet()){
            System.out.println(res.getKey());
            System.out.println(res.getValue());
        }
        obj.put("Abc",50);
        obj.put("Abd",120);
        obj.put("Abe",170);
        obj.put("Abf",190);
        obj.put("Abg",120);
        obj.put("Abh",40);
        //key cannot be duplicate but value can be
        int res= obj.getOrDefault("Abc",60);
        System.out.println(res);
        System.out.println(obj);
    }
}
