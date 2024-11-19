package problem_solving;

public class Reverse_String_Using_Recursion {

    public static void main(String[] args){

        String str = "pruthviraj";
        System.out.println("Before reverse : "+str);

        String abc = reverse(str);
        System.out.println("After reverse : "+abc);

    }

    public static String reverse(String str){

        if(str == null || str.length()<=1){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
