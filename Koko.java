
class Koko{
    static void main() {
        int[] piles = {3,6,7,11};
         System.out.println(search(piles , 8));
    }
    static int findMax(int[] piles){
        int end = 0;
        for(int pile : piles){
            end = Math.max(end , pile);
        }
        return end;
    }
    static boolean findHours(int [] piles , int h , int k){
        int hours = 0;
        for (int i = 0; i < piles.length ; i++) {
             hours += Math.ceil((double) piles[i] / k);
        }
        return hours <= h;
    }
    static int search(int[] piles , int h){
        int start = 1;
        int end = findMax(piles);
        while(start < end){
            int mid = start + (end - start) / 2;
            if(findHours(piles,h,mid)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}