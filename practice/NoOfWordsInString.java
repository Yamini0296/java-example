class NoOfWordsInString
{
	public static void main(String[] args)
	{
		String s="never afraid to fail";
		int count=0;
		String []a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]!=" ")
			{
			count++;
			}
		}
		System.out.println(count);
	}
}