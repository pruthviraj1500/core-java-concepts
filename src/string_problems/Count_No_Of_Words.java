package string_problems;

public class Count_No_Of_Words {

    public static void main(String[] args){

        String str = "Java      Programming questions";

        int wordCount = 1;

        System.out.println(str.split("\\s+").length);          // <--------- Approach 1

        for(int i=0; i<str.length()-1; i++){                       // <-------- Approach 2
            if (str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                wordCount++;
            }
        }
        System.out.println(wordCount);
    }
}
