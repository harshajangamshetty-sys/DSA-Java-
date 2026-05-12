import java.util.*;

public class Findindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int rows = sc.nextInt();

        System.out.println("ENTER THE NUMBER OF COULMNS");
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        //input
        System.out.println("ENTER THE INPUT ELEMENTS");
        for(int i = 0; i < rows;i++){
            for(int j = 0;j < cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("ENTER NUMBER YOU WANT TO FIND");
        int x = sc.nextInt();


        //output
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
                if (numbers[i][j] == x) {
                    System.out.println("NUMBER FOUND AT LOCATION  ("+i+","+j+")");
                    
                }
            }
        }
    }   
}
