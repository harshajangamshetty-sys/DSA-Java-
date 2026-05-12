import java.util.*;

public class eoelements {
  public static void evenOdd(int numbers[]){
    int odd = 0;
    int even = 0;
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]%2 == 0){
       even++;
       }else{
            odd++;
}
}
System.out.println("even = "+even);
System.out.println("odd = "+odd);

}  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE NO OF ELEMENTS");
    int size = sc.nextInt();

    int numbers[] = new int[size];

    System.out.println("ENTER THE ARRAY ELEMENTS");
    for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
    }
    evenOdd(numbers);

  }
}
