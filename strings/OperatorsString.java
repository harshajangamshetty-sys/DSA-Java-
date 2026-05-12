import java.util.ArrayList;

public class OperatorsString {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a"+"b");
        System.out.println((char)('a' + 4));

        System.out.println("a" + 1); 
        // integer will be converted to Integer that will call toString()
        // this is  same as after a few steps: "a" + "b"

        System.out.println("harsha" + new ArrayList<>());
        System.out.println("harsha" + new Integer(56));

        System.out.println("56" + new ArrayList<>());
        //u can use the + operator with primitives and u can u this with all the complex objects but atlest one of the object should be of type string
    }
}
