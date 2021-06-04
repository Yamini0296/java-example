import java.util.*;
class Main
{
    public static long fibonacci(int x)
    {
        if(x <= 1)
        {
            return x;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
    public static void doTestPass()
    {
        boolean result=true;
        result=result && fibonacci(0)==0;
        result=result && fibonacci(1)==1;
        result=result && fibonacci(2)==1;
        result=result && fibonacci(10)==55;
        result=result && fibonacci(40)==102334155;
        if(result)
        {
            System.out.println("all test pass");
        }
        else
        {
            System.out.println("there are test failures");
        }
    }
    public static void main(String args[])
    {
        doTestPass();
    }
}