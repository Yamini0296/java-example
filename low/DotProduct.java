//2.Dot product
   //- Given two matrices [1 2],[3 5] passed as an array.
   
   //- Return the dot product of the two matrices.
//solution
import java.util.*;
class Main
{
    public static int dotProduct(int[] array1,int[] array2)
    {
        int sum1 = 1;
        for(int i = 0; i < array1.length; i++)
        {
            sum1 *= array1[i];
        }
        int sum2 = 1;
        for(int i = 0; i < array2.length; i++)
        {
            sum2 *= array2[i];
        }
        return sum1+sum2;
    }
    public static void doTestPass()
    {
        int[] array1={1,2};
        int[] array2 = {2,3};
        int sum= dotProduct(array1,array2);
        if(sum !=8)
        {
            System.out.println("Test 1 Failed");
        }
        else
        {
            System.out.println("Test 1 pass");
        }
    }
    public static void main(String args[])
    {
        doTestPass();
    }
}
