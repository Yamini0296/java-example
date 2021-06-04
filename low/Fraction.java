//
//1. Add Fractions
   // -Given two fractions passed as an array.
   // -Return the fraction which is result of addition of the two fraction.
    //-Fraction is represented as two elements array-numerator ,denominator.
    //-Returned fraction should be in simplest form.
//Solution
//
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int arr1[] = new int[n1];
        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = s.nextInt();
        }
        int arr2[] = new int[n2];
        for(int i = 0; i < arr2.length; i++)
        {
            arr2[i] = s.nextInt();
        }
        int numAns = s.nextInt();
        int denAns = s.nextInt();
        doTestPass(arr1,arr2,numAns,denAns);
    }
    public static void doTestPass(int[] arr1,int arr2[],int numAns,int denAns)
    {
        int[] result=addFraction(arr1,arr2);
        if(result[0]==numAns && result[1]==denAns)
        {
            System.out.println("test passed");
            return;
        }
        else
        {
            System.out.println("test failed");
            return;
        }
    }
    private static int[] addFraction(int[] arr1,int[] arr2)
    {
        int x1 = arr1[0]*arr2[1];
        int x2 = arr1[1]*arr2[0];
        int num = x1 + x2;
        int den = arr1[1]*arr2[1];
        int gcdAns = gcd(num,den);
        if(gcdAns == 1)
        {
            return new int[]{num,den};
        }
        else
        {
            int[] result = eliminateGcd(gcdAns,num,den);
            return result;
        }
    }
    private static int[] eliminateGcd(int gcdAns,int num,int den)
    {
        num = num / gcdAns;
        den = den / gcdAns;
        if(gcd(num,den) > 1)
        {
            int[] res1 = eliminateGcd(gcd(num,den),num,den);
            num = res1[0];
            den = res1[1];
        }
        return new int[]{num,den};
    }
    private static int gcd(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
}
