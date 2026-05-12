import java.util.*;

public class smallestelement {
    public static int miniMum(int minimum[]){
    int min = Integer.MAX_VALUE;

for(int i=0;i<minimum.length;i++){
if(minimum[i]<min){
  min=minimum[i];
}

        }
        return min;

    }
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int size = sc.nextInt();
        int minimum[]=new int [size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
minimum[i]=sc.nextInt();
        }
miniMum(minimum);
System.out.println("the smallest element is "+miniMum(minimum));

    }

}

