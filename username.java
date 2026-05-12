import java.util.*;


public class username {
   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     String email = sc.next();
     StringBuilder userName = new StringBuilder("");


     for(int i=0; i<email.length(); i++) {
       if(email.charAt(i) == 'e') {
        userName.append("i");
       } else {
          userName.append(email.charAt(i)); 
       }
     }


     System.out.println(userName);
   }
}

