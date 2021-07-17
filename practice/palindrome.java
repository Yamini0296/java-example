class Palindrome{  
 public static void main(String args[]){  
  int remainder,sum=0,temp;    
  int n=4242; 
  temp=n;    
  while(n>0){    
   remainder=n%10;  //getting remainder  
   sum=(sum*10)+remainder;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  