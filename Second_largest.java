import java.util.*;

public class Second_largest {
    public static int secondLargest(int numbers[]){
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int i = 0;i < numbers.length;i++){
            if (numbers[i]>max){
                secondmax = max;
                max = numbers[i];
            }else if(numbers[i] > secondmax && numbers[i] != max){
               secondmax = numbers[i];
}
        }
        return secondmax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER THE NO OF ELEMENTS");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i = 0; i < size;i++){
            numbers[i] = sc.nextInt();
        }
        int result = secondLargest(numbers);
        System.out.println("THE SECOND LARGEST ELEMENT IS "+result);

    }
}
