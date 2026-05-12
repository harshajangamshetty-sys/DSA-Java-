public class rhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            //spaces
            int spaces = n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
