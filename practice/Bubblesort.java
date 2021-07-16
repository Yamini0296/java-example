class Bubblesort
{
static int sort(int[] a)
{
int temp=0;
for(int i=0;i<a.length-1;i++)
{
for(int j=0;j<a.length-i-1;j++)
{
if(a[j]>a[j+1])
{
   temp=a[j];
    a[j]=a[j+1];
    a[j+1]=temp;
}
}
}
return temp;
}
public static void main(String[] args)
{
int[] a={6,2,9,3,0,1};
sort(a);
for(int n:a)
{
System.out.print(n+"\t");
}
}
}