package interview_preparation;

public class Search_In_Rotated_Sorted_Array {

    public static void main(String[] args){

        int[] arr = {4,5,6,7,0,1,2};

        int target = 0;

        int index = search(arr, target);

        System.out.println(index);

    }

    public static int search(int[] nums, int target){

        if(nums == null || nums.length == 0){
            return -1;
        }

        if(nums.length == 1 && nums[0] == target){
            return 0;
        }

        int start = 0;
        int end = nums.length-1;

        while(start<=end){

            int mid = (start+end)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[start] <= nums[mid]){
                if(nums[start] <= target  && target < nums[mid]){
                    end = mid-1;
                }else {
                    start =  mid+1;
                }
            }
            else {
                if(nums[mid] < target && target <= nums[end]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
       return -1;
    }
}
