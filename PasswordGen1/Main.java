public class MyProgram 
{
    public static void main(String[] args)
    { 
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%&*_+=?";
        String password = "";

        for (int i = 0; i < 2; i ++) {
        int randUpper = (int) Math.floor(Math.random() * upperCase.length());
        int randLower = (int) Math.floor(Math.random() * lowerCase.length());
        int randNum = (int) Math.floor(Math.random() * numbers.length());
        int randSym = (int) Math.floor(Math.random() * symbols.length());
        password += lowerCase.substring(randLower, randLower + 1);
        password += upperCase.substring(randUpper, randUpper + 1);
        password += numbers.substring(randNum, randNum + 1);
        password += symbols.substring(randSym, randSym + 1);
        }
        System.out.println(password);
    }   
}