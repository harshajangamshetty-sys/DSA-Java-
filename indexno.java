import java.util.*;

public class indexno {
public static int indexNumber(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]== key){
return i;
        }
    }
 
return -1;
}
    



public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("ENTER THE SIZE OF ARRAY");
    int size = sc.nextInt();

    int numbers[] = new int[size];

    System.out.println("ENTER THE ARRAY ELEMENTS");
    for(int i=0;i<size;i++){
         numbers[i] = sc.nextInt();
    }
    System.out.println("ENTER THE ELEMENT YOU WANT TO FIND");
    int key = sc.nextInt();

int result =indexNumber(numbers, key);
if (result == -1){
System.out.println("ELEMENT NOT FOUNF");
}else{
    System.out.println("ELEMENT FOUND AT INDEX "+result);
}



}
    
}
