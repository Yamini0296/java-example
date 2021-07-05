
import java.util.*;
class Main
{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
  String inputString = sc.nextLine();
  String outputString = "";

  int count = 1;
  for (int i = 0; i < inputString.length(); i++) {

   // resetting to 1 for every new character 
   count = 1;
   while (i < inputString.length() - 1 && inputString.charAt(i) == inputString.charAt(i + 1)) {
    count++;
    i++;
   }
   outputString = outputString + inputString.charAt(i) + count;
  }
  System.out.println("Input data string : " + inputString);
  System.out.println("Output data string : " + outputString);

 }

}