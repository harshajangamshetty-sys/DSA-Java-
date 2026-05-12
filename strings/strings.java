public class strings {
    public static void main(String[] args) {
        //substring
        String name = "harshajangamshetty";
        String detect = name.substring(6,name.length());
        System.out.println(detect);

        //strings are immutable 
        // (string cannot be modified,added,substracted or deleted)
        //to add or delete anything we should make a new string

        //chartAt
        for(int i =0; i < name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        //length
            System.out.print(name.length());
        
    }
}
