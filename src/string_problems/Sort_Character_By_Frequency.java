package string_problems;

/*

Example 1 :-
Input - "teee"     Output - "eeet"

Example 2 :-
Input - "dddbbb"   Output - "dddbbb" or "bbbddd"

Example 3 :-
Input - "Eett"     Output - "ttEe" or "tteE"


 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sort_Character_By_Frequency {

    public static void main(String[] args){

        String str = "teee";
        int n = str.length();

        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Character>[] chArr = new List[n+1];

        for(char ch : map.keySet()){
            int num = map.get(ch);

            if(chArr[num] == null){
                chArr[num] = new ArrayList<>();
            }
            chArr[num].add(ch);
        }

        for(int i= chArr.length-1; i>=0; i--){
            if(chArr[i] != null){
                List<Character> list = chArr[i];

                for(char ch : list){
                    int count = map.get(ch);
                    while(count > 0){
                        sb.append(ch);
                        count--;
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}
