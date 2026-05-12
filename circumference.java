import java.util.*;

public class circumference {
    public static double Circumference(double r){
        double circum = 2*Math.PI*r;
        return circum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double result=Circumference(r);
        System.out.println(result);

    }
}
