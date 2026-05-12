public class logn {
    public static int logN(int x, int n){
        if(n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int half = logN(x, n/2);
        if(n % 2==0){
        return half*half;
        }else{
        return half*half*x;
        }
    }
    public static void main(String[] args) {
        int x=12,n=2;
        int ans = logN(x, n);
        System.out.println(ans);
    }
}
