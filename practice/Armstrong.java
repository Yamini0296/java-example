import java.util.Scanner;
class Arm
{
public static void main(String[] args)
{
Scanner Scn=new Scanner(System.in);
System.out.println("enter a number");
int n=Scn.nextInt();
int res=0;
int a=n,rem,count=0;
while(n!=0)
{
rem=n%10;
res+=Math.pow(rem,count);
n=n/10;
}
if(a==res)
{
System.out.println("armstrong number");
}
else
System.out.println("not armstrong");
}
}
