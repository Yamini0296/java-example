
import java.util.*;
public class HashMap
{
	public static void main(String args[])
	{
		
		HashMap<String, String> hm = new HashMap<>();

		// Adding values to HashMap 
		hm.put("Language", "Java");
		hm.put("company", "tcs");
		hm.put("account", "gs");
		hm.put("Learn", "More");

		System.out.println("Testing .isEmpty() method");

		
		if (!hm.isEmpty())
		{
			System.out.println(hm.get("Language"));
			System.out.println(hm.get("company"));
			System.out.println(hm.get("acount"));
			System.out.println(hm.get("Learn"));

			System.out.println(hm.size());
		}
	 if (hm.containsKey("Company"))
            System.out.println(hm.get("Company"));

	 Set<String> hmkeys = hm.keySet();
        System.out.println(hmkeys);
  
        Collection<String> hmvalues = hm.values();
        System.out.println(hmvalues);
	}
}
