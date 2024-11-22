package string_problems;

import java.util.HashSet;
import java.util.Set;

public class Longest_SubStr_Without_Repeating_Char {

    public static void main(String[] args){

        String str = "abcabcb";

        int maxcount=0;
        int i=0;
        int j=0;

        HashSet<Character> set = new HashSet<>();

        while(i < str.length() && j < str.length()){
            char ch = str.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
                maxcount = Math.max(maxcount,j-i);
            }else {
                set.remove(ch);
                i++;
            }
        }
        System.out.println("Count of longest subString is : "+maxcount);
    }
}
