import java.util.*;
//import java.util.Map.Entry;
public class TestMap {
	
	public static void main(String []asd) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(new Integer(1), "ALK");
		ht.put(new Integer(2), "ERT");
		ht.put(new Integer(3), "HHT");
		ht.put(new Integer(5), "SEW");
		ht.put(new Integer(4), "HJJ");
		ht.put(new Integer(6), "ADF");
		Map<Integer,String> map=new TreeMap<Integer,String>(ht);
		Enumeration<String> e=ht.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
		System.out.println();
		
		for(Map.Entry<Integer, String> en:map.entrySet()) {
			System.out.println(en.getKey()+" ---> "+en.getValue());
		}
	}
}
