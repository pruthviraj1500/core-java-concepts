package string_problems;

/*

Example 1 :
str1 = "ade" str2 = "abcdefgh"  -------> return true

Example 2 :
str1 = "ade" str2 = "abcedfgh"  -------> return false

 */



public class Chk_Str_Subseq_Another_Str {

    public static void main(String[] args){

        String str1 = "ade";
        String str2 = "abcdefgh";

        boolean isValid = checkValidSubsequence(str1, str2);
        if(isValid){
            System.out.println("Valid Subsequence");
        }else {
            System.out.println("Not valid Subsequence");
        }
    }

    public static boolean checkValidSubsequence(String str1, String str2){

        int i=0;
        int j=0;

        if(str1.length() == 0){
            return true;
        }

        while(i<str1.length() && j<str2.length()){

            if(str1.charAt(i) == str2.charAt(j)){
                i++;
            }

            if(str1.length() == j){
                return true;
            }
            j++;
        }
        return false;
    }
}
