package Recursion;

public class Fibonacci {
    static void main() {
int m = 25;
        for (int n = 0; n <= m;n ++) {
        int ans =  printFib(n);
            System.out.println(ans);
        }
    }
    static int printFib(int n ){
    if(n < 2){
        return n;
    }
    return printFib(n - 1) + printFib(n - 2);
    }
}
