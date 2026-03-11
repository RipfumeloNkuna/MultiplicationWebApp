
/*package za.ac.tut.model;

/**
 *
 * @author ripfu
 */
/*public class PasswordChecker {
 
   public String password;
   int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int specialCount = 0;
   
   public boolean isvalid(String password)
   {
       Boolean valid=false;
       
       if(password.trim().length() != 10)
       {
           valid=false;
       }
       
       for(int i=0;i<password.length();i++)
       {
         char c=password.charAt(i);
         
         if(c=='@' || c=='#')
         {
             return false;
         }
         
         else if (Character.isLetter(c) || Character.isDigit(c) || (!(Character.isDigit(c) || Character.isLetter(c))))
          {
             if(Character.isUpperCase(c))
             {
                 upperCount++;
             }
             else if (Character.isLowerCase(c))
             {
                 lowerCount++;
             }

          }
       }
       
         if(upperCount>=2 && lowerCount>=2 && password.trim().length()>= 10 )
         {
            valid=true; 
         }
       return valid;
   }
       
   } */


package za.ac.tut.model;

public class PasswordChecker {

    public Boolean isValid(String password) {

        Boolean valid = false;

        if (password == null) {
            return valid;
        }

        // Check length (exactly 10 characters)
        if (password.trim().length() != 10) {
            return valid;
        }

        int upperCount = 0;
        int lowerCount = 0;

        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);

            // Reject forbidden characters
            if (c == '@' || c == '#') {
                return valid;
            }

            if (Character.isUpperCase(c)) {
                upperCount++;
            }

            if (Character.isLowerCase(c)) {
                lowerCount++;
            }
        }

        // Final validation condition
        if (upperCount >= 2 && lowerCount >= 2) {
            valid = true;
        }

        return valid;
    }
}
