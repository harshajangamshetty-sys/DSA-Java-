import java.util.*;

public class reversearray {
    public static int[] reverseArray(int numbers[]){
int start = 0;
    int end = numbers.length - 1;

    while(start < end){
        int temp = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;

        start++;
        end--;
    }
return numbers;

}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE NO ELEMENTS");
    int size = sc.nextInt();

    int numbers[]= new int[size];

    System.out.println("ENTER THE ARRAY ELEMENTS");
    for(int i = 0;i < numbers.length;i++){
        numbers[i]=sc.nextInt();
    }
int result[] = reverseArray(numbers);
System.out.println("REVERSED ARRAY");
for(int i=0;i<result.length;i++){
System.out.println(result[i]);
}


}
}
