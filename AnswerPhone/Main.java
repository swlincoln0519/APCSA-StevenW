public class Main
{
    public static void main(String[] args)
    {
        //morning & friend
        System.out.println(answerCall(true, true, false));
        //morning & friend & asleep 
        System.out.println(answerCall(true, true, true));
        //asleep
        System.out.println(answerCall(false, false, true));
        //isFriend
        System.out.println(answerCall(false, true, false));
        //isFriend & asleep 
        System.out.println(answerCall(false, true, true));
        
    }
    
    public static boolean answerCall(boolean morning, boolean isFriend, boolean asleep) {
        if (asleep) {
            return false; 
        }
        else if (morning && isFriend) {
            return true;
        }
        return true;
    }
}