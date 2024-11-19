package problem_solving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingNumber {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(0,-1,-6,-3,1,3,4,5,6,7);

        Collections.sort(list);

        int a = 0;

        for(int i=0; i<=list.size(); i++){
            int b = list.get(i);

            if(b<0){
                continue;
            }
            if(a != b){
                System.out.println("The missing number is : "+b);
                break;
            }
            a++;
        }
    }
}
