package interview_preparation;

import java.util.HashSet;

public class Max_Sum_Of_Dist_SubArray_WithKSize {

    public static void main(String[] args){

        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;

        int sum = findSumOfDistSubArrayWithSizeK(nums,k);

        System.out.println(sum);
    }

    public static int findSumOfDistSubArrayWithSizeK(int[] arr, int size){

        int start = 0;
        int sum = 0;
        int maxSum = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int end=0; end < arr.length; end++){

            /*
            sum = sum + arr[end];

            if(end >= size-1){
                maxSum = Math.max(sum,maxSum);
                sum = sum - arr[start];
                start++;
            }
             */

            while (set.contains(arr[end])){
                set.remove(arr[start]);
                sum -= arr[start];
                start++;
            }

            set.add(arr[end]);
            sum += arr[end];

            if((end-start)+1 == size){
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
}
