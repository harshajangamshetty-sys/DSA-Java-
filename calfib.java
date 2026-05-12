public class calfib {
    public static void calFib(int a,int b,int n){
        if(n==0){
        return;
        }
        int c = a+b;
        System.out.println(c);
        calFib(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n = 11;
        calFib(a, b, n-2);
    }
}
