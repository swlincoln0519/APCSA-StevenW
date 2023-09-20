import java.util.Arrays;
public class Main 
{
    public static void main(String[] args)
    {
        int[] roomNum = new int[] {754, 756, 164, 168, 172};
        String[] teacherName = {"Mr. Luu", "Mr. Gracia ", "Ms. Situ", "Mr. Skramstad", "Mr. Paja"};
        int[] reverseNum = new int[roomNum.length] ;
        String[] reverseName = new String[teacherName.length];
        
        System.out.println("Lists before revseral: ");
        System.out.println(Arrays.toString(roomNum));
        System.out.println(Arrays.toString(teacherName));
        System.out.println("");
        
        for (int i = 0; i < roomNum.length; i++) {
         reverseNum[i] = roomNum[roomNum.length - i - 1];
        }
        
        for (int i = 0; i < teacherName.length; i++) {
         reverseName[i] = teacherName[teacherName.length - i - 1];
        }
        System.out.println("");
        System.out.println("Lists after revseral: ");
        System.out.println(Arrays.toString(reverseNum));
        System.out.print(Arrays.toString(reverseName));
    }     
}  