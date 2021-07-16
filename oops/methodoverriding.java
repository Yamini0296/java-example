class Sample1
{
public void display()
{
System.out.println("dispaly in sample1");
}
}
class Sample2
{
public void display()
{
System.out.println("dispaly in sample2");
}
}
class Sample
{
public static void main(String[] args)
{
System.out.println("dispaly in main");
Sample2 s1=new Sample2();
s1.dispaly();
}
}