public class kadaneAlgo {
    static void main(String[] args) {
        int [] nums = {-2, -2, 1 , 3, -3 ,-2 ,4 ,-1 , 2 };
        System.out.println(kadaneAlgorithm(nums));
    }
    static int kadaneAlgorithm(int [] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i] , currentSum + nums[0]);
            maxSum = Math.max(currentSum , maxSum);
        }
        return maxSum;
    }
}
