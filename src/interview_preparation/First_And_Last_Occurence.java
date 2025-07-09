package interview_preparation;

import java.util.Arrays;

public class First_And_Last_Occurence {

    public static void main(String[] args){

        int[] arr = {5,7,7,8,8,10};

        int target = 8;

        int[] result = findFirstAndLastOccurence(arr,target);
        System.out.println(Arrays.toString(result));

    }

    public static int[] findFirstAndLastOccurence(int[] arr, int target){
        int [] result = {-1,-1};

        result[0] = findFirstOccurence(arr, target);
        result[1] = findLastOccurence(arr, target);

        return result;
    }

    public static int findFirstOccurence(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        int index = -1;

        while (start <= end){

            int mid = (start + end)/2;

            if(arr[mid] == target){
                index = mid;
                end = mid-1;
            } else if (arr[mid] > target)  {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return index;
    }

    public static int findLastOccurence(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        int index = -1;

        while (start <= end){
            int mid = (start + end)/2;

            if(arr[mid] == target){
                index = mid;
                start = mid+1;
            } else if (arr[mid] > target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return index;
    }
}
