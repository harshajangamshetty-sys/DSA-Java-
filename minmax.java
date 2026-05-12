import java.util.*;

public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int minmax[] = new int[size];
        int max =Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        //input
        for(int i=0;i<minmax.length;i++){
minmax[i]=sc.nextInt();
        }
        
        for(int i =0;i<minmax.length;i++){
            if(minmax[i]>max){
max=minmax[i];
}if(minmax[i]<min){
   min= minmax[i];
}
        }
        System.out.println("THE SMALLEST NUMBER IS "+min);
        System.out.println("THE LARGEST NUMBER IS "+ max);
    }
}
