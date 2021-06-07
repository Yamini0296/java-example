import java.util.*;
public class Main
{
    public static String reverseString(String str)
    {
        String result= "";
        for(int i = str.length()-1; i >=0; i--)
        {  
            result=result+str.charAt(i);
        }
        return result;
    }
    public static boolean doTestPass()
    {
        String testString;
        String Solution;
        boolean result=true;
        result=result && reverseString("abcd").equals("dcba");
        result=result && reverseString("odd abcde").equals("edcba ddo");
        result=result && reverseString("even abcde").equals("edcba neve");
        result=result && reverseString("").equals("");
        return result;
    }
    public static void main(String[] args)
    {
        if(doTestPass())
        {
            System.out.println("All tests pass");
        }
        else
        {
            System.out.println("Some tests fail");
        }
    }
}