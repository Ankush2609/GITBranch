package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map1 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//Instead of Add Use Put in Map
		hm.put(1101, "Ankush");
		hm.put(101, "Ram");
		hm.put(102, "Shyam");
		hm.put(102, "Yogesh");
		System.out.println(hm);

		//System.out.println(hm.get(102));
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1101, "valentina");
		lhm.put(101, "Jacob");
		lhm.put(102, "Markus");
		lhm.put(102, "Mensur");
		//System.out.println(lhm);
		//lhm.remove(101);
		//System.out.println(lhm);
		//System.out.println(lhm.containsKey(102));
		//System.out.println(lhm.containsValue("Yogesh"));
		//lhm.replace(102, "Ganesh");
		System.out.println(lhm);
		lhm.putAll(hm);
		System.out.println(lhm);
		
		for(Map.Entry<Integer, String> m : hm.entrySet())
		{
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		
	}

}
