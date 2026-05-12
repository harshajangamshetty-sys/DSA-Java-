import java.util.Arrays;

public class TwoDbinarysearch {
    public static void main(String[] args) {

        int [][] matrix = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20}

           } ;
        System.out.println(Arrays.toString(searchTarget(matrix,20)));
    }
    public static int[] searchTarget(int[][] nums , int target){
        int r = 0;
        int c = nums[0].length-1;
        while(r<nums.length && c>=0){
            if(nums[r][c]==target){
                return new int[]{r,c};
            }
            if(nums[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};             
    }
}
