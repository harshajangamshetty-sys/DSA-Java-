public class Sub {
    static void main() {
        int [] nums = {7 , 2 , 5 , 10 , 8};
        int ans = splitArray(nums , 2);
        System.out.println(ans);
    }
    public static int splitArray(int[] nums, int k) {
        int start = max(nums);
        int end = sum(nums);
        while(start < end){
        int mid = start + (end - start) / 2;
        if(sumOfSplit(nums , k , mid)){
            end = mid;
        }else{
            start = mid + 1;
        }
        }
        return start;
    }
    static int max(int [] nums){
        int start = 0;
        for (int num : nums){
            start = Math.max(start , num);
        }
        return start;
    }
    static int sum(int [] nums){
        int end = 0;
        for (int num : nums){
            end += num;
        }
        return end;
    }
    static boolean sumOfSplit(int [] nums , int k , int s){
        int sum = 0;
        int count = 1;
        for (int num : nums) {
            if( sum + num > s){
                count ++;
                sum = 0;
            }
            sum += num;
        }
        return count <= k;
    }
}
