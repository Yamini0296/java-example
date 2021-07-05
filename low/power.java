 public class Power
         {
          //Given base and integer exponent,compute value of base raised to the power of exponent 

          public static double power(double base,int exponent)
             {  
		int result=1;
		while(exponent>0)
		{result*=base;
		 exponent--;
			}
		System.out.println(result);
             return result;
		
             }
 
     public static boolean doTestsPass()
        {
         boolean doTestsPass=true;
        double result=power(2,2);
	
         return doTestsPass && result==4;
	
       }
      public static void main(String[] args) {
         if(doTestsPass())
          {
           System.out.println("all tests passed");
      
          }
       else
        {
       System.out.println("there is a test failure");
       }
  
     }
    }
