package problem_solving;

import java.util.Arrays;
import java.util.List;

public class FindOddNumbers {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(12,23,12,134,49,23,13,42,41,47,92,45);

        for(int i=0; i< list.size(); i++){
            int a = list.get(i);

            if(!(a%2 == 0)){
                System.out.println(a);
            }
        }

        list.stream()
                .filter(x -> x%2 != 0)
                .sorted()
                .forEach(y -> System.out.println(y));

    }

}
