package stream_api_problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterElements {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Object obj = numbers.stream()
                .filter(n -> n%2 != 0)
                .collect(Collectors.toList());

        System.out.println("Odd numbers : " + obj);

        // output : [1, 3, 5, 7, 9]

    }

}
