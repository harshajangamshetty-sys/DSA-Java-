import java.util.*;

public class vote {
    public static void EligibleVoter(int n){
        if(n>18){
            System.out.println("Eigible to vote");
        }else{
            System.out.println("Not Eligible to vote");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
EligibleVoter(n);
    }
}
