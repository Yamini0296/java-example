class CountThePunctuations{
	public static void main(String[] args)
	{
		String s="hi!never afraid to fail,be thankfull.";
		int count=0;
		 
		char[] ch=s.toCharArray();
			System.out.println(ch);

		for(int i=0;i<ch.length;i++)
		{
			
			
			if((ch[i]=='!')||(ch[i]==',')||(ch[i]=='.')||(ch[i]==';')||(ch[i]=='?')||(ch[i]=='"'))
			{
			count++;
			}
		}
		System.out.println(count);
	}

}