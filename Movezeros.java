import java.util.*;

public class Movezeros {

    public static int[] moveZeros(int arr[]) {
        int index = 0;

        // Step 1: Move all non-zero elements forward
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Step 2: Fill remaining positions with 0
        while(index < arr.length) {
            arr[index] = 0;
            index++;
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF ARRAY");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("ENTER THE ARRAY ELEMENTS");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = moveZeros(arr);

        System.out.println("Array after moving zeros:");

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
    

