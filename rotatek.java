import java.util.Arrays;

class rotatek {
    public static int[] rotate(int[] nums,int n) {
      n=n%nums.length;
        //step 1:Reverse the array
        reverse(nums, 0,nums.length-1);
        //step 2:reverse the first n elements
        reverse(nums,0,n-1);
        //step 3:reverse the remaining elements
        reverse(nums,n,nums.length-1);

        
        return nums;

    }
     static void reverse(int[] nums,int left,int right){
      while(left<right){
        int temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
      }
    }
    public static void main(String[] args) {
      int n =3;
      int nums[]={1,2,3,4,5,6,7};
     int ans[]=rotate(nums, n);

      System.out.print(Arrays.toString(ans));
    }
}
