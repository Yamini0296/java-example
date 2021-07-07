class CountVowelsAndConsonents{
	public static void main(String[] args)
	{
		String s="hi!never afraid to fail be thankfull.";
		int countV=0;
		int countC=0;
		 
		char[] ch=s.toCharArray();
			System.out.println(ch);

		for(int i=0;i<ch.length;i++)
		{
			
			
			if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')||(ch[i]=='A')||(ch[i]=='E')||(ch[i]=='I')||(ch[i]=='0')||(ch[i]=='U'))
			{
			countV++;
			}
			else{

			countC++;}
		}
		System.out.println(countV);
		System.out.println(countC);
	}

}