package stream_api_problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountOccurrences {

    public static void main(String[] args){

        List<String> items = Arrays.asList("honda","hero","tvs","bajaj","bajaj","honda","tvs");

        Object obj = items.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(obj);

        // Output : {tvs=2, bajaj=2, honda=2, hero=1}

        String st = "Rraaj";
        Object obj1 = st.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println(obj1);

        // Output : {a=2, r=1, R=1, j=1}

        /*
        - chars() :- It will converts the String into IntStream, Rather it directly provide chars
                     it will provides ascii value of it.
         */

    }


}
