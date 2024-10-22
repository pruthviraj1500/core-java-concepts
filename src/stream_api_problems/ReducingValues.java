package stream_api_problems;

import java.util.Arrays;
import java.util.List;

public class ReducingValues {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Perform Sum operation

        Object obj = numbers.stream()
                .reduce(0 , Integer::sum);

        System.out.println("Addition of the list is : " + obj);

        // Output : 15


    }

}
