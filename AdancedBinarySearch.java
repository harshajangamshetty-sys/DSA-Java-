import java.util.Arrays;

public class AdancedBinarySearch {
    public static void main(String[] args) {
        int [][]nums ={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        int [] ans = mainSearch(nums, 20);
        System.out.println(Arrays.toString(ans));
    }

    static int[] binarySearch(int [][] nums,int row, int cStart,int cEnd,int target){
        while(cStart<= cEnd){
            int mid = cStart+(cEnd- cStart)/2;
            if( nums[row][mid] == target){
                return new int[]{row,mid};
            }
            if (nums[row][mid]< target) {
                cStart = mid+1;
            }else{
                cEnd = mid-1;
            }
        }
            return new int[]{-1,-1};
    }
    static int[] mainSearch(int [][] nums,int target){
        int rows = nums.length;
        int cols = nums[0].length;
        
        if (cols == 0) {
            return new int[] {-1,-1};
            
        }
        if (rows == 1){
             return binarySearch(nums, 0, 0, cols-1, target);

        }

        //halfing the rows using columns
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;
        while(rStart < rEnd-1){
            int mid = rStart +(rEnd - rStart)/2;
            if(nums[mid][cMid]== target){
                return new int[]{mid, cMid};
            }
            if (nums[mid][cMid]<target) {
                rStart = mid;
                
            }else{
                rEnd = mid;
            }
        }
    
        

        //checking the middle element of the two remaining rows
        if (nums[rStart][cMid]== target) {
            return new int[]{rStart,cMid};
            
        }if (nums[rStart+1][cMid]== target) {
            return new int[]{rStart+1,cMid};
             }
 
             //checking in the quadrants
             
             //1st quadrant
             if (cMid +1 >= 0 && target <= nums[rStart][cMid-1]) {
                return binarySearch(nums, rStart, 0, cMid-1, target);
                }
                //2nd quadrant
                 if (cMid+1 < cols && target >= nums[rStart][cMid+1] && target <=nums[rStart][cols-1] ) {
                return binarySearch(nums, rStart, cMid+1, cols-1, target);
                }
                //3rd quadrant
                 if (cMid +1 >= 0 && target <= nums[rStart+1][cMid-1]) {
                return binarySearch(nums, rStart+1, 0, cMid-1, target);
                }
                 else {
                return binarySearch(nums, rStart+1, cMid +1, cols-1, target);
                }
            }
        }
    
            
                
                
            
            
        




