import java.util.*;

public class sumofelements {
    public static int sumElements(int numbers[]){
        int sum = 0;
        for(int i=0;i<numbers.length;i++){
         sum=sum+numbers[i];
        }
return sum;
 }



    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("ENTER THE NO OF ELEMENTS");
        int size=sc.nextInt();

        int numbers[]= new int[size];

        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i = 0; i <numbers.length;i++){
        numbers[i]=sc.nextInt();
        }

        int result= sumElements(numbers);
        System.out.println(result);
        
            }
}
