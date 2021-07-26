import java.util.*;
public class Main
{
   public static int[] longestUniformSubstring(String s)
   {
       int a[]=new int[2];
        int i=0,j=0,index=0;
        int count=0;
        while(i<s.length())
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                if(i-j>count)
                {
                    count=i-j;
                    index=j;
                }
                j=i;
                i++;
            }
            i++;
        }
        if(i-j>count)
        {
            count=i-j;
            index=j;
        }
        if(s.length()==0)
        {
           a[0]=-1;
           a[1]=count;
        }
        else
        {
            a[0]=index;
            a[1]=count;
        }
        return(a);
             
  }
 public static void main(String[] args) 
 {
          Map<String,Integer[]> testCases=new HashMap<String,Integer[]>(); 
           testCases.put("",new Integer[] {-1,0});
           testCases.put("10000111",new Integer[] {1,4});
           testCases.put("aabbbbCdAA",new Integer[] {2,4});
           boolean pass=true;
           for(Map.Entry<String,int[]> testCase :testCases.entrySet())
            {
                int[] result=longestUniformSubstring(testCase.getKey());
                pass=pass && (Arrays.equals(result,testCase.getValue()));
            }
            if(pass)
            {
              System.out.println("all tests pass");
            }
            else
            {
              System.out.println("there is a test failure");
            }
  }
}
