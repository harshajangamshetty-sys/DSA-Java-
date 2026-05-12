import java.util.Arrays;

public class selection {

    static int[] selectionSort(int []nums){
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length-i-1;
            int maxindex = getMaxIndex(nums, 0, last);
            swap(nums, maxindex , last);
        }
        return nums;

    }
    static int getMaxIndex(int[]nums,int start,int end){
        int max = start;
        for (int i = 0; i <=end; i++) {
            if (nums[max]<nums[i]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int [] nums , int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    public static void main(String[] args) {
        int [] nums = {5,4,3,2,1};
          int [] ans = selectionSort(nums);
        System.out.println(Arrays.toString(ans));

    }
}