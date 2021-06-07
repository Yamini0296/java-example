package introduction;

import java.util.*;
class PasswordInvalidException extends Exception
{
    public PasswordInvalidException(String pwd) {
	super(pwd);
   }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int countspe=0,countup=0,countnumeric=0;
        for(int i=0;i<str.length();i++)
        {
	//uppercase
            
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                countup++;
            }
	//checking numerics
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                countnumeric++;
            }
	//special char

		if(str.charAt(i)=='!' || str.charAt(i)=='@' || str.charAt(i)=='#' || str.charAt(i)=='$'|| str.charAt(i)=='%'|| str.charAt(i)=='_' || str.charAt(i)=='^' || str.charAt(i)=='&' || str.charAt(i)=='*' ||str.charAt(i)=='!')
            {
                countspe++;
            }
        }
        try
        {
            if(countspe>0 && countup>0 && str.length()>16 && countnumeric==0)
            {
             throw new PasswordInvalidException("Password Changed Successfully");
            }
            if(countnumeric>0)
            {
             throw new PasswordInvalidException("Password Should not have numarics");
            }
            if(str.length()<16)
            {
             throw new PasswordInvalidException("Password length should be greater than 16");
            }
        }
        catch(Exception ref)
        {
          System.out.println(ref);
          
        }
        finally{ 
	System.out.println("Validation Done!");   
 }
    }
}
