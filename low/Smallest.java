import java.util.*;
class Main
{
  public static void main(String args[])
  {
      Scanner s = new Scanner(System.in);
      int n1 = s.nextInt();
      int arr[] = new int[n1];
      for(int i = 0; i < arr.length; i++)
      {
          arr[i] = s.nextInt();
      }
    doTestPass(n1,arr);
  }
  public static boolean doTestPass(int n1,int arr[])
  {
    boolean result=true;
    result=result && (findmin(new int[]{3,4,5,6,1,2})==1);
    result=result && (findmin(new int[]{2,1})==1);
    result=result && (findmin(new int[]{1})==1);
    result=result && (findmin(new int[]{1,2,3,4,5,6})==1);
    result=result && (findmin(new int[]{4,1,2,3})==1);
    result=result && (findmin(new int[]{3,2,1,4})==1);
    try
    {
        findmin(null);
        result=false;
    }
    catch(Exception e)
    {
      result=result && true;
    }
    if(result)
    {
      System.out.println("All test pass");
    }
    else
    {
      System.out.println("Test Failed");
    }
    return result;
  }
  static int findmin(int []arr)
  {
    // for(int i=0;i<arr.length;i++)
    // {
    //   for(int j=i+1;j<arr.length;j++)
    //   {
    //     if(arr[i]>arr[j])
    //     {
    //       int temp=arr[i];
    //       arr[i]=arr[j];
    //       arr[j]=temp;
    //     }
    //   }
    // }
    Arrays.sort(arr);
    System.out.println("min:"+arr[0]);
    return arr[0];
  }
}