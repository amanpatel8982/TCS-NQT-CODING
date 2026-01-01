package StringAssesment;

// Que 4. Write a Java program to reverse a given string.
// Input: "Hello"
// Output: "olleH"


public class Ques4 
{
    public static void main(String[] args) 
    {
        String str = "Hello";
        String reveString = "";

        for(int i = str.length()-1; i >= 0; i--)
        {
            reveString = reveString + str.charAt(i);
        }

        System.out.println("Input: " + str);
        System.out.println("Output: " + reveString);


    }
    
}
