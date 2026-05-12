public class xpowern {
    public static int findPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int power_nm1 = findPower(x, n-1);
        int power_n = x * power_nm1;
        return power_n;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans =findPower(x, n);
        System.out.println(ans+" ");
    }
}
