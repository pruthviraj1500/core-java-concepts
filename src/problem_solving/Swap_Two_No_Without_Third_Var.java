package problem_solving;

public class Swap_Two_No_Without_Third_Var {

    public static void main(String[] args){

        int a = 20;
        int b = 40;

        System.out.println("Before swapping a : "+a+" and b : "+b);

//        a = a+b;
//        b = a-b;
//        a = a-b;

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("After swapping a : "+a+" and b : "+b);

    }


}
