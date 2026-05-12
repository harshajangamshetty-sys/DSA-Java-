public class Numberscube {
    public static void main(String[] args) {
        cubeNum(4);

    }
    public static void cubeNum(int n){
        int originalN = n;
 n = 2 * n -1  ;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                int index = originalN - Math.min(Math.min(i,j),Math.min(n-i-1,n-j-1));
                System.out.print(index+ " ");
            }
            System.out.println();
        }
    }
}
