import java.util.*;

public class xpower {
    public static double powerofNumber(double x,double n){
        double result =1;
for(int i=0;i<n;i++){
     result = result * x;
}
return result;
    }
public static void main(String[] args) {
    System.out.println("Enter X");
    Scanner sc = new Scanner(System.in);
    double x=sc.nextDouble();
    System.out.println("Enter N");
    double n=sc.nextDouble();
   double ans=powerofNumber(x, n);
System.out.println("ANSWER "+  ans);
}
}
