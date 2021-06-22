import java.util.*;
import java.util.Arrays;
public class Main
{
	
	public static void anagrams(String arr[])
	{
	    HashMap<String, List<String> > map=new HashMap<>();
		for (int i=0;i<arr.length;i++){
			String word=arr[i];
			char[]letters=word.toCharArray();
			Arrays.sort(letters);
			String newWord=new String(letters);
			if(map.containsKey(newWord))
			{
				map.get(newWord).add(word);
			}	
			else
			{
				List<String>words=new ArrayList<>();
				words.add(word);
				map.put(newWord,words);			}
					}	
					for(String s:map.keySet())
					{
						List<String> values=map.get(s);
						if(values.size()>1)
						{
							System.out.print(values);
						}
					}
		}
		public static void main(String[] args) {
	   String arr[]={"cat","dog","tac","god","act"};
	   anagrams(arr);
	}

}