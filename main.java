import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(1);
        // list.add(67);
        // list.add(67);
        // list.add(3);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        // System.out.println(list.contains(555));
        
        // System.out.println(list);
        // list.set(0, 1);
        // list.remove(2);
        // System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

            for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here,list[index] will not work here
                
            }
            
        
        }
}



