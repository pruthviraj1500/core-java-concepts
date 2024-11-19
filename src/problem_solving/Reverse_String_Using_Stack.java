package problem_solving;

import java.util.Stack;

public class Reverse_String_Using_Stack {

    public static void main(String[] args){

        String str = "pruthviraj";
        System.out.println("Before reverse : "+str);

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            stack.push(ch);
        }
        System.out.print("After reverse : ");
        while (!stack.empty()){
            char ch = stack.pop();
            System.out.print(ch);
        }
    }
}
