import java.util.*;


public class GCD{
   public static int commmonDivisor(int n1,int n2) {
       while(n1 != n2) { 
           if(n1>n2) {
               n1 = n1 - n2;
           } else {
               n2 = n2 - n1;
           }
       }
       return n1;
   } 
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER n1");
    int n1=sc.nextInt();

    System.out.println("ENTER n2");
    int n2=sc.nextInt();
    commmonDivisor(n1, n2);
    System.out.println("GCD IS " +commmonDivisor(n1, n2));

   }  
}
