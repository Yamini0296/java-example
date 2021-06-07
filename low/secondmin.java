import java.util.*;
public class Main 
{ 
    public static int secondSmallest(int[] arr)
    {
        if(arr.length > 1)
        {
            int secondmin;
            int n,min;
            n = arr.length;
            for (int i = 0; i < n; i++) 
            {
                for (int j = i + 1; j < n; j++) 
                {
                    if (arr[i] > arr[j]) 
                    {
                        min = arr[i];
                        arr[i] = arr[j];
                        arr[j] = min;
                    }
                }
            }
            System.out.println("The second  Smallest element in the array is :"+arr[1]);
            secondmin=arr[1];
            System.out.println(secondmin);
            return secondmin;
        }
        else
        {
            return 0;
        }
    }   
    public static void main(String args[])
    {
        doTestPass();
    }
    public static boolean doTestPass()
    {
        int[] a={};
        int[] b={0};
        int[] c={0,1};
        int[] d={-1,0,1,-2,2};
        int[] e={1,1,2};
        int[] f={Integer.MAX_VALUE};
        int[] g={Integer.MIN_VALUE,0,Integer.MAX_VALUE};
        boolean result=true;
        result = result & secondSmallest(a)==0;
        result = result & secondSmallest(b)==0;
        result = result & secondSmallest(c)==1;
        result = result & secondSmallest(d)==-1;
        result = result & secondSmallest(e)==1;
        result = result & secondSmallest(f)==0;
        result = result & secondSmallest(g)==0;
        if(result)
        {
            System.out.println("All tests pass");	
        }
        else
        {
            System.out.println("There are test failures");
        }
        return result;
    }
}