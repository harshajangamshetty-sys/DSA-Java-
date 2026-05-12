public class patterns {
    public static void main(String[] args) {
        int n = 4;
        //outer loop
        for(int i=1;i<=n;i++){
            //innner loop_1
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop_2
            for(int j=1;j<=i;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
