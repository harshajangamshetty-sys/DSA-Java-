import java.util.*;
public class greats {
    public static int PrintGreater(int a,int b) {
if (a>b){
return a;
}else{
    return b;
}
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int result=PrintGreater(a, b);
System.out.println(result + "is Greater");
    }
}
