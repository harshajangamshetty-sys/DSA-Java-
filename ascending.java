import java.util.*;


public class ascending {
   public static boolean asCending(int numbers[]) {
     
       for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
           if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
               return false;
           }
       }
       return true;
}
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("ENTER THE SIZE OF THE ARRAY");
    int size = sc.nextInt();

    int numbers[] = new int[size];

    System.out.println("ENTER THE ARRAY ELEMENTS");
    for(int i=0;i<size;i++){
    numbers[i]=sc.nextInt();
    }

    boolean result = asCending(numbers);
    if(result){
        System.out.println("ARRAY IS SORTED");
    }else{
        System.out.println("ARRAY IS NOT SORTED");
    }

}

}


