package problem_solving;

public class Reverse_String_Using_Loop {

    public static void main(String[] args){

        String str = "pruthviraj";
        System.out.println("Before reverse : "+str);

        char[] charArray = str.toCharArray();

        int start = 0;
        int end = str.length()-1;

        while (start <= end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        System.out.println("After reverse : "+new String(charArray));

    }


}
