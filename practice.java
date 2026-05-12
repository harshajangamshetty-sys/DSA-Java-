

public class practice {
    // public static void linearSearch(int[]nums,int key){
    //    for ( int i = 0; i < nums.length; i++) {
    //     if(nums[i]==key){
    //        System.out.println(i);
    //     }
        
    //     }
      
         
    // }
    // public static void main(String[] args) {
    //     int nums[]={1,3,5,6,7,22,66};
    //     int key = 22;
    //     int i=0;
    //   linearSearch(nums, key);
    
    // public static int[] bubbleSort(int nums[]){
    //   for (int i = 0; i < nums.length; i++) {
    //     for (int j = 0; j < nums.length-1; j++) {
    //         if(nums[j]>nums[j+1]){
    //             int temp = nums[j];
    //             nums[j]=nums[j+1];
    //             nums[j+1]=temp;
    //         }
    //     }
    //   }
    //   return nums;
    // }
    //  public static void main(String[] args) {
    //     int nums[]={3,5,6,2,1,7,0};
    //     int ans[] = bubbleSort(nums);

    //     System.out.println(Arrays.toString(ans));
    // public static int[] inserstionSort(int nums[]){
    //     for (int i = 1; i < nums.length; i++) {
    //         int key = nums[i];
    //         int j = i-1;
    //         while( j>=0 && nums[j]>key){
    //         nums[j+1]=nums[j];
    //         j--;
    //         }
    //        nums[j+1]=key;
    //     }
    //     return nums;
    //  }
    //  public static void main(String[] args) {
    //     int[]nums = {3,4,1,2,8,9};
    //     int ans[] = inserstionSort(nums);
    //     System.out.println(Arrays.toString(ans));

    // public static int binarySearch(int[]nums,int target){
    //  int start = 0;
    //  int end = nums.length-1;
    //  boolean isAsc = nums[start] < nums[end];
    //   while(start<=end){
    //   int mid = start+(end - start)/2;
    //   if(target==nums[mid]){
    //     return mid;
    //   }else if(isAsc){
    //    if(target<nums[mid]){
    //     end = mid -1;
    //    }else{
    //     start = mid+1;
    //    }
    //   }else{
    //      if(target>nums[mid]){
    //     end = mid -1;
    //    }else{
    //     start = mid+1;
    //    }
    //   }
    //     }
    //     return -1;
    // }

        
    //  public static void main(String[] args) {
    //     int nums[] = {1,2,3,4,54,60,70,80,90};
    //     int target = 80;
    //     int ans = binarySearch(nums, target);
    //     System.out.println(ans);
    // }

  // public static int findMin(int[] nums) {
  //       int start = 0;
  //       int end = nums.length-1;
  //     while(start <= end){
  //     int mid = start +(end - start)/2;
  //     if(nums[start] <= nums[end]){
  //       return nums[start];
  //     }
  //     else{
  //       if(nums[mid] >= nums[start]  ){
  //         start = mid+1;
  //       }else if(nums[mid] < nums[start] && nums[mid] > nums[mid-1]){
  //           end = mid - 1;
  //       }else{
  //           return nums[mid];
  //       }
  //     }
  //     }
  //     return -1; 
  //   }
  //   public static void main(String[] args) {
  //       int[] nums = {3,1,2};
  //       int ans = findMin(nums);
  //       System.out.println(ans);
  //   }
 
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start +(end - start)/2;
            if(target == nums[mid]){
            return mid;
            }
            if(target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }

        }
        return start ;
      
       }
    
    public static void main(String[] args) {
      int[] nums = {1,3,5,6};
      int target = 4;
      int ans = searchInsert(nums, target);
      System.out.println(ans);
    }
}



    

