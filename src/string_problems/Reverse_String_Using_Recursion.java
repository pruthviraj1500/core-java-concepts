package string_problems;

public class Reverse_String_Using_Recursion {

    public static void main(String[] args){

     String str = "pruthviraj";
     System.out.println("Before reverse : "+str);

     String abc = reverse(str);
     System.out.println("After reverse : "+abc);
    }

    public static String reverse(String a){
        if(a == null || a.length()<=1){
            return a;
        }
        return reverse(a.substring(1)) + a.charAt(0);
    }

}
