public class palindrome {
    public static void main(String[] args) {
        String  name = "";
        boolean ans = checkPalindrome(name);
        System.out.println(ans);
    }
    static boolean checkPalindrome(String name){
        if (name == null || name.length() == 0) {
            return true;
            
        }
        name = name.toLowerCase();
     for (int i = 0; i < name.length()/2; i++) {
        char start = name.charAt(i);
        char end = name.charAt(name.length()-1-i);
        if (start!= end) {
           return false;
        }
     }
     return true;
}
}
