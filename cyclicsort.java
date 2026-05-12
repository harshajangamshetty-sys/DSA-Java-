import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int [] nums = {3, 5, 2, 1, 4, 0};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
   public static void sort(int [] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] ;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

    }
    static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
