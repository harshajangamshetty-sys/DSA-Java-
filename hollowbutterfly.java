public class hollowbutterfly {
    public static void main(String[] args) {
        int n = 5;
        //for first part
        for(int i=1;i<=n;i++){
            //for first line
            for(int j=1;j<=1;j++){
                    System.out.print("*");
            }
            //for second line
            for(int j =2;j<=i;j++){
                if(j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //for spaces
            int spaces =2*(n-i);
            for(int j=1;j<=spaces;j++){
                    System.out.print(" ");
            }
            //for third line
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            //for fourth line
            for(int j=2;j<=i;j++){
                if(j==i){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
            //for second part
            for(int i=n;i>=1;i--){
            //for first line
            for(int j=1;j<=1;j++){
                    System.out.print("*");
            }
            //for second line
            for(int j =2;j<=i;j++){
                if(j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //for spaces
            int spaces =2*(n-i);
            for(int j=1;j<=spaces;j++){
                    System.out.print(" ");
            }
            //for third line
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            //for fourth line
            for(int j=2;j<=i;j++){
                if(j==i){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
