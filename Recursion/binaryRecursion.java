package Recursion;

public class binaryRecursion {
    static void main() {
        int [] nums = {1,2,4,7,8,10};
        System.out.println(search(0 , nums.length - 1, 11 , nums));
    }
    static int search(int start , int end , int target , int[] nums){
        if(start > end){
            return - 1;
        }
        int mid = start + (end - start)/2;
        if(target == nums[mid]){
            return mid;
        }
        if(target > nums[mid]){
            return search(mid + 1 , end , target , nums);
        }
        return search(start , mid - 1  , target , nums);
    }
}
