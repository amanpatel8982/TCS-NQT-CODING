package String;

public class LengthOfLastWord 
{


    public static int LastChar(String s)
    {
        String str = s.trim();
        int count =0;

        for(int i=str.length()-1; i>=0; i--)
        {
            if(str.charAt(i) != ' ')
            {
                count ++;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        String str = "Hello Aman";
        System.out.println(LastChar(str));   
    }
}
