public class Main 
{
    public static void main(String[] args)
    {
        int n = (int) (Math.random() * 10) + 1;
        String[] randPass = randomVal(n);
        for (int i = 0; i < n; i++) {
            System.out.println(randPass[i]);
            System.out.println();
        }
    }
    
        public static String[] randomVal(int n) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = generateCustomPassword(2, 2, 2, 10);
            }
            return arr;
        }
        
        public static String generateCustomPassword(int minSymbols, int minUpperCase, int minLowerCase, int length) {       
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%&*_+=?";
        String password = "";
        
        for (int i = 0; i < minUpperCase; i++) {
        int randUpper = (int) Math.floor(Math.random() * upperCase.length());
        password += upperCase.substring(randUpper, randUpper + 1);
        }
        for (int i = 0; i < minLowerCase; i ++) {
        int randLower = (int) Math.floor(Math.random() * lowerCase.length());
        password += lowerCase.substring(randLower, randLower + 1);
        }
        for (int i = 0; i < minSymbols; i ++) {
        int randSym = (int) Math.floor(Math.random() * 10);
        password += symbols.substring(randSym, randSym + 1);
        }
        int lengthy = length - minUpperCase - minLowerCase - minSymbols;
        
        for (int i = 0; i < lengthy; i ++) {
        int randNum = (int) Math.floor(Math.random() * 10);
        password += numbers.substring(randNum, randNum + 1);
        }
        
        return password;
        }
}