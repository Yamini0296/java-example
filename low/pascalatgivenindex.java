import java.util.*;
public class Solution
    {
     public static int pascal(int a,int n) 
     {int x;
         
          int sum1=1,sum2=1,sum3=1;
          for(int i=1;i<=a;i++)
          {
              sum1=sum1*i;
          }
          for(int i=1;i<=a-n;i++)
          {
              sum2=sum2*i;
          }
          for(int i=1;i<=n;i++)
          {
              sum3=sum3*i;
          }
          System.out.println(x=(sum1)/((sum2)*(sum3)));
      return x;
     }
    
 public static boolean doTestPass()
  {
    boolean result = true;
    result = result && pascal(0,0)==1;
  
    result = result && pascal(2,1)==2;
     
    result = result && pascal(6,5)==6;
    
    result = result && pascal(8,4)==70;
        
    result = result && pascal(6,6)==1;
    if(result)
    {
      System.out.println("All Test Cases Pass");
    }else
    {
        System.out.println("Test Case Fail");
    }
    return result;
  }
  public static void main(String[] Args)
  {
    doTestPass();
  }
}
