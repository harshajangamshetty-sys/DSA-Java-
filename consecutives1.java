public class consecutives1 {
    public static int conSecutive1(int[]nums,int max,int count){
        for(int j=0;j<nums.length;j++){
            if(nums[j]==1){
                count++;
            
              if (count>max){
                max=count;
              }
            }else{
                count=0;
            }
            

              }
              return max;
        }
        public static void main(String[] args) {
            int max = 0;
            int count=0;
            int nums[]={1,1,0,1,1,1};
            int ans=conSecutive1(nums, max,count);
            System.out.print(ans+" ");
        }
    }

