package Recursion;

public class MakeBouquets {
    static void main() {
        int[] bloomDays = {1,10,3,10,2 };
        int ans  = search(bloomDays , 3 , 1);
        System.out.println(ans);

    }
    static int search(int [] bloomDays , int m , int k){
        int start = 1;
        int end = maxNumber(bloomDays);
            if(bloomDays.length < (long)m*k){
               return -1;
            }
        while(start <end){
            int mid = start + (end - start) / 2;
            if(noOfDays(bloomDays, m , k , mid)){
                end  = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int maxNumber(int [] bloomDays){
        int end = 0;
        for (int bloomDay : bloomDays ) {
            end = Math.max(end , bloomDay);
        }
        return end;
    }
    static boolean noOfDays(int[] bloomDays , int m  ,int k , int s ){
        int streak = 0;
        int bouquet = 0;
        for (int i = 0; i < bloomDays.length; i++) {
          if(bloomDays[i] <= s){
              streak++;
          }else{
             streak = 0;
          }
          if(streak == k){
              bouquet++;
              streak= 0;
          }
        }
        return bouquet >= m;
    }
}
