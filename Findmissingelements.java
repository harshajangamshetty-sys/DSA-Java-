import java.util.ArrayList;

import java.util.List;




class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if ( nums[i]>0 && nums[i] <=nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
        public static void main(String[] args){
            int [] nums = {3,4,-1,1};
            List<Integer> sol = findDisappearedNumbers(nums);
           System.out.println((sol));

        }
        
    
}