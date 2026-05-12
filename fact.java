public class fact {
    public static int calFact(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact_nm1 = calFact(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }
    public static void main(String[] args){
        int n =5;
        int sol=calFact(n);
        System.out.println(sol);
    }
}
