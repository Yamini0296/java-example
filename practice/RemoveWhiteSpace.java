class RemoveWhiteSpace{
	public static void main(String[] args)
	{
		String s="I am good girl";
		String s2=s.replaceAll("\\s","");
		System.out.println(s2);
	}	
}