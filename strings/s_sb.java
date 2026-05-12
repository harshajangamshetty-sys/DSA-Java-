public class s_sb {
    public static void main(String[] args) {
        // String name = "Harsha";
        // System.out.println(name);

        // String a = "Harsha";
        // System.out.println(a);

        // a = "Jangamshetty";
        // System.out.println(a);

        // String a = "harsha";
        // String b = "harsha";
        // // ==
        // System.out.println(a == b); it gives true,as reference variables are pointing to the same object
        // (it creates the object inside the string pool)
        
        // String a = new String("harsha");
        // String b = new String("harsha");
        // System.out.println(a == b); it gives false,as reference variables are pointing to different variables
         // (it creates the object outside the string pool in "heap")

        //  System.out.println(a.equals(b)); if u only want to check the values
        // System.out.println(a.charAt(5));

        // System.out.println("Hello, " + args[0] + "!"); "cammand line arguments"
        // StringBuilder series = new StringBuilder();
        // for (int i = 0; i < 26; i++) {
        //     char ch = (char)('a'+i);
        //     series.append(ch);
        //     }
        //     System.out.println(series);
         
        String name = "ab";
       
       boolean ans = palindrome(name);
System.out.println(ans);

    }
    static boolean palindrome (String name){
        name = name.toLowerCase();
        
        if (name == null|| name.length() == 0) {
            return true;
        }
        for (int i = 0; i < name.length()/2; i++) {
            
            int start = name.charAt(i);
            int end = name.charAt(name.length()-1-i);
    
        if (start != end) {
            return false;
      }
     }
     return true;
    }
}
    
