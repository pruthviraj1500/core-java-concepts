package interview_preparation;

import java.util.HashMap;

public class Longest_Substr_With_Atmost_Two_Dist_Char {

    public static void main(String[] args){

        String s = "eeeecerceba";
        int k = 2;

        int num = lengthOfLongestSubstring(s,k);

        System.out.println(num);

    }

    public static int lengthOfLongestSubstring(String s , int k){

        int start = 0;
        int maxCount = -1;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int end = 0; end < s.length(); end++){
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch,0)+1);

            while (map.keySet().size() > k){
                char removeCh = s.charAt(start);
                if (map.get(removeCh) == 1){
                    map.remove(removeCh);
                }else {
                    map.put(removeCh, map.get(removeCh)-1);
                }
                start++;
            }

            if(map.keySet().size()==k){
                maxCount = Math.max(maxCount, end - start + 1);
            }
        }
        return maxCount;
    }
}
