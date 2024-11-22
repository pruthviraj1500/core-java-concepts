package string_problems;

/*
Input : "abbaca"
Output : "ca"
 */


import java.util.Stack;

public class Remove_Adjacent_Duplicates {

    public static void main(String[] args){

        String str = "abbaca";

        StringBuffer sb = new StringBuffer();

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(!stack.isEmpty() && stack.peek() == str.charAt(i)){
                stack.pop();
            }else {
                stack.push(str.charAt(i));
            }
        }
//        while (!stack.isEmpty()){         <----- output reversed i.e.ac
//            sb.append(stack.pop());
//        }

        for(char ch : stack){
            sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}
