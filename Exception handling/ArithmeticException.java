import java.util.*;
public class Main {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int arr1[] = new int[] {2,30,29,35,24};
			try {
				System.out.println(arr1[n]);
				System.out.println(arr1[n]/0);
				
			}
				catch(ArithmeticException e) {
					System.out.println(e);
						System.out.println("Arithmetic exception handling");
				}
				catch(ArrayIndexOutOfBoundException e) {
					System.out.println(e);
					System.out.println(" ArrayIndexOutOfBoundException handling");
				}
	}
