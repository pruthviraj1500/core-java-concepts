package string_problems;

import java.util.HashSet;

public class Find_Duplicate_Characters {

    public static void main(String[] args){

        String str = "java";

        HashSet<Character> set = new HashSet<>();
        System.out.print("The duplicate characters are : ");
        for(int i=0; i<=str.length()-1; i++){
            char ch = str.charAt(i);
            if(set.contains(ch)){
                System.out.print(ch+" ");
            }else{
                set.add(ch);
            }
        }
    }
}
