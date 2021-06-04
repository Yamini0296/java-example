//5.first Non Repeating
// find the 1st character that doesn't repeat anywhere
//Ex-in apple the 1st non repeating character is a.
//Implement the following test caes.Add more test cases if possible.
             //returns true if all the tests pass otherwise returns false

//solution

import java.util.*;
class Main
{
    public static char findFirst(String input)
    {
        ArrayList<Character> li = new ArrayList<Character>();
        boolean swap = true;
        char ch[] = input.toCharArray();
        for(int i = 0; i < ch.length; i++)
        {
            for(int j = i + 1; j < ch.length; j++)
            {
                if(ch[i] == ch[j])
                {
                    swap = false;
                    li.add(ch[i]);
                    break;
                }
            }
            if(swap == true && !li.contains(ch[i]))
            {
                return ch[i];
            }
            else
            {
                swap = true;
            }
        }
        return Character.MIN_VALUE;
    }
    public static void doTestPass()
    {
        String[] input={"apple","racecars","ababdc"};
        char[] output={'a','e','d'};
        boolean result=true;
        for(int i=0;i<input.length;i++)
        {
            result=result && (findFirst(input[i])==output[i]);
            if(!result)
            {
                System.out.println("Test failed for " + input[i]);
            }
            else
            {
                System.out.println("Test passed for "+input[i]);
            }
            result = true;
        }
    }
    public static void main(String[] args)
    {
        doTestPass();
    }
}
