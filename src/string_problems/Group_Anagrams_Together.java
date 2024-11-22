package string_problems;

/*
Example 1 :-
Input - {"eat","tea","tan","ate","nat","bat"}

Output - [[eat, tea, ate], [bat], [tan, nat]]

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams_Together {

    public static void main(String[] args){

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = new ArrayList<>();

        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);

            if(map.containsKey(key)){
                map.get(key).add(str);
            }else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(key,strList);
            }
        }
        result.addAll(map.values());
        System.out.println(result);
    }
}
