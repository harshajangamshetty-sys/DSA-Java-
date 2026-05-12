import java.util.*;

public class TwoDarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int rows = sc.nextInt();
        System.out.println("ENTER THE NUMBER OF COLUMNS");
        int cols = sc.nextInt();

        int numbers[][] = new int [rows][cols];

        //INPUT
        System.out.println("ENTER THE INPUT ELEMENTS");
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
            //ouput
            System.out.println("OUTPUT ELEMENTS");
            for(int i = 0;i < rows;i++){
                for(int j = 0;j < cols;j++){
                    System.out.print(numbers[i][j]+" ");
                }
                System.out.println();
            }


        
    }
}
