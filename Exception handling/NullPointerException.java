import java.util.*;
public class Main {
	public static void main(String[] args) {
		String s= null;
		 
		try {
			    
                System.out.println(s.length());
			}
			
		catch(NullPointerException e) {
			System.out.println(e);
			System.out.println("NullPointerException  handling");
			}
		finally{
			 System.out.println(s);
			}
	}

}