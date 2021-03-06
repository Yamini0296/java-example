import java.util.*;
class Main
{
    public static boolean isPowerOf10(int x)
    {
        if(x == 1)
        {
            return true;
        }
        int sum = total(x);
        if(sum == 1 && x > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private static int total(int x)
    {
        int sum = 0;
        while(x > 0)
        {
            int a = x % 10;
            sum += a;
            x = x / 10;
        }
        return sum;
    }
    public static void doTestPass()
    {
        boolean swap = true;
        int[] isPowerList={1,10,100,10000};
        int[] isNotPowerList={3,50,-1};
        for(int i:isPowerList)
        {
            if(!isPowerOf10(i))
            {
                System.out.println("Test failed for "+i);
                swap = false;
            }
        }
        for(int i:isNotPowerList)
        {
            if(!isPowerOf10(i))
            {
                System.out.println("Test failed for "+i);
                swap = false;
            }
        }
        if(swap == true)
        {
            System.out.println("All test Passed");
            return;
        }
        else
        {
            System.out.println("Some test cases failed");
            return;
        }
    }
    public static void main(String[] args)
    {
        doTestPass();
    }
}