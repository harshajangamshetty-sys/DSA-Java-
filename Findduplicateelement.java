public class Findduplicateelement {
    public static void main(String[] args) {
        int []nums = {1,3,4,2,6,2};
       int ans = findDup(nums);
        System.out.println((ans));

    }
    public static int findDup (int[] nums){
        int i = 0;
        while(i < nums.length){
        if(nums[i] != i+1){
            int correct = nums[i] - 1;
            if ( nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }else{
                return nums[i];
            }
        }else{
            i++;
        }
    }
            return -1;
        }
       
       
    
    public static void swap(int[]nums,int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
