public class MajorityElement {
    static void main(String[] args) {
        int [] nums = {1,2 ,3 , 4 ,5 , 6 , 6};
        System.out.println(majorityElement(nums));
    }
    static int majorityElement(int [] nums){
        int count = 0;
        int candidate = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate)? 1 : -1;
        }
        return candidate;
    }
}
