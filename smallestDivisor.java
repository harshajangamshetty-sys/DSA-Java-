public class smallestDivisor {
    static int search(int[] nums , int threshold){
        int start = 1;
        int end = (maxNum(nums));
        while(start < end){
            int mid = start + (end - start) / 2;
            if(sum(nums , threshold, mid)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int maxNum(int [] nums){
        int end = 0;
        for(int num : nums){
            end = Math.max(end , num);
        }
        return end;
    }

    static boolean sum(int [] nums , int threshold , int s){
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double)num/ s);
        }
        return sum <= threshold;
    }
    public static void main(String[] args) {
        int [] nums = {1 , 2 , 5 , 9};
        int threshold = 6;
        int ans = search(nums , threshold);
        System.out.println(ans);
    }

}
