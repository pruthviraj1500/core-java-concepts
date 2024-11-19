package problem_solving;

import java.util.ArrayList;
import java.util.List;

public class Find_Prime_Numbers {

    public static void main(String[] args){

        int target = 18;
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<=20; i++){
            if(isPrime(i)){
                System.out.println(i);
                list.add(i);
            }
        }

        for(int i=0; i< list.size()-1; i++){
            int a = list.get(i);
            int b = list.get(i+1);

            int sum=a+b;

            if(target == sum){
                System.out.println("Sum of Prime numbers "+a+" and "+b+" is equal to the target number");
            }
        }
    }

    public static boolean isPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }

        if(num==2){
            return true;
        }

        for(int i=2; i<=num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
