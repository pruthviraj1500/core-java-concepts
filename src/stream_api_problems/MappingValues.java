package stream_api_problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingValues {

    public static void main(String[] args){

        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Find length of each word

        Object obj = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(obj);

        // output : [5, 6, 6]

    }

}
