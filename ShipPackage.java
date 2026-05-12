public class ShipPackage {
   public static void main(String[] args) {
        int [] weights = {3 , 2 , 2 , 4 , 1 , 4};
        int ans = shipWithinDays(weights , 3);
        System.out.println(ans);
   }
    public static int shipWithinDays(int[] weights, int days) {
        int start = maxNum(weights);
        int end = totalWeight(weights);
        while(start < end){
            int mid = start + (end - start) / 2;

            if(totalDays(weights , days , mid)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }
    static int maxNum(int [] weights){
        int start = 0;
        for (int weight : weights){
            start = Math.max(start , weight);
        }
        return start;
    }
    static int totalWeight(int [] weights){
        int end = 0;
        for (int weight : weights){
            end += weight;
        }
        return end;
    }
    static boolean totalDays(int [] weights , int days , int s){
        int sum = 0;
       int totalDays = 1;
        for (int i = 0; i < weights.length; i++) {
           if(sum + weights[i] > s){
               totalDays++;
               sum = 0;
           }
           sum += weights[i];
        }
        return totalDays <= days;
    }
}
