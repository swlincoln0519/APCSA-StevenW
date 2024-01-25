public class Main
{
    public static void main(String[] args)
    {
        String[] teachers = {"Mr. Luu", "Mr. Garcia", "Mr. Brewer", "Ms. Situ", "Ms. Willis", "Ms. Crabtree"};
        teachers = insertIntoArray(teachers, 2, "Mr. Skramstad");
        for (int i = 0; i < teachers.length; i++) {
            String teacher = teachers[i];
            System.out.print(teacher + " | ");
        }
    }
    
    public static String[] insertIntoArray(String[] arr, int index, String name) {
        String[] newArr = new String[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = name;
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}