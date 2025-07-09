package interview_preparation;

import java.util.HashMap;

public class Optimized_Max_Sum_Of_Dist_SubArray_WithKSize {

    public static void main(String[] args){

        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;

        int sum = findSumOfDistSubArrayWithSizeK(nums,k);

        System.out.println(sum);
    }

    public static int findSumOfDistSubArrayWithSizeK(int[] arr, int k){

        int start = 0;
        int maxSum = 0;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int end = 0; end < arr.length; end++){

            int sum = 0;
            int num = arr[end];
            map.put(num, map.getOrDefault(num,0)+1);

            while (map.keySet().size() > k){

                int removeNum = arr[start];

                if(map.get(removeNum) == 1){
                    map.remove(removeNum);
                }else {
                    map.put(removeNum, map.get(removeNum)-1);
                }
            }

            if(map.keySet().size() == k){
                maxSum = Math.max(maxSum, sum + arr[end]);
            }
        }
        return maxSum;
    }
}
