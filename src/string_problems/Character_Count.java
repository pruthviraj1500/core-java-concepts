package string_problems;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Character_Count {

    public static void main(String[] args){

        String str = "java";

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(Character c : str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
