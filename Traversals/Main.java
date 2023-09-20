import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        String[] className = {"Mandarin", "Health", "AP CHEM", "JROTC", "AP LANG", "APUSH", "AP CALC AB", "APCSA"};
        String[] teacherName = {"Situ", "Mcgillen", "Willis", "Harris", "Paja", "Garcia", "Luu", "Skramstad"};
        
        System.out.println("This is the list of my classes.");
        System.out.println(Arrays.toString(className));
        System.out.println("");
        System.out.println("This is the list of my teacher's last name.");
        System.out.println(Arrays.toString(teacherName));

        System.out.println("");
        System.out.println("ODD:");
        //(i += 2), because the loop is looping through the list by 2s. 
        //(int i = 0), because it makes the loop start at 0, then it adds one
        //to display the first value, which is the odd value.
        for (int i = 0; i < className.length; i += 2) {
         System.out.println((i + 1) + " - " + className[i] + " (" + teacherName[i] + ")");
        }
        
        System.out.println("");
        System.out.println("EVEN:");
        //(int i = 1), because that makes the loop began at the first value
        //then displays the value directly after the first value, 
        //making it an even value. 
        for (int i = 1; i < teacherName.length; i += 2) {
         System.out.println((i + 1) + " - " + className[i] + " (" + teacherName[i] + ")");
        }
    }
}