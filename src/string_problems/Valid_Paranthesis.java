package string_problems;

/*
Example 1 :-
Input - "{[]})"    Output - Invalid

Example 2 :-
Input - "{()}[]"   Output - Valid

Example 3 :-
Input - "([)}"     Output - Invalid

 */

import java.util.Stack;

public class Valid_Paranthesis {

    public static void main(String[] args){

        String str = "{()}[]";

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){

            if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '['){

                stack.push(str.charAt(i));

            }else if(!stack.isEmpty() &&
                    (str.charAt(i) == '}' && stack.peek() == '{') ||
                    (str.charAt(i) == ')' && stack.peek() == '(') ||
                    (str.charAt(i) == ']' && stack.peek() == '[')
            ){
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            System.out.println("Valid Paranthesis");
        }else {
            System.out.println("Not valid parenthesis");
        }
    }
}
