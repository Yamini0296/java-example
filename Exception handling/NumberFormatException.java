import java.util.*;
public class Main {
	public static void main(String[] args) {
			String s="0224abc";
			try {     
            		int i=Integer.parseInt(s);
			}
			catch(NumberFormatException e) {	
			System.out.println(e);
			System.out.println("NumberFormatException  handling");
			}
			finally{
			    System.out.println(s);
			    }
			}

			}