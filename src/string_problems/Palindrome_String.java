package string_problems;

public class Palindrome_String {

    public static void main(String[] args){

        String str = "nitin";

        int start = 0;
        int end = str.length()-1;

        boolean isPalindrome = true;

        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                isPalindrome = false;
                break;
            }
            else {
                start++;
                end--;
            }
        }

        if(isPalindrome){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }

    }
}
