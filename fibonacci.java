import java.util.*;

public class fibonacci {
    public static void sumofPrev2(int n){
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
       int next =a+b;
       a=b;
       b=next;
        }
 }

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No Of Terms");
        int n = sc.nextInt();
        sumofPrev2( n);
}
    }


