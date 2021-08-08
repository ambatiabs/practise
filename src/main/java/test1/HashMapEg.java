package test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEg {

	public static void main(String[] args) {
		HashMap<String , String> eg1 = new HashMap<String, String>();
		eg1.put("Ambatiabs", "Shankar111@");
		eg1.put("sainath", "somisetty111@");
		System.out.println("eg1:"+eg1);
		eg1.get("sainath");
		System.out.println("eg1:"+eg1.get("sainath"));
		System.out.println("eg1:"+eg1.get("Ambatiabs"));
		for(String sai: eg1.keySet()) {
			System.out.println("sai:"+sai);
			System.out.println("sai:"+sai);
			
		}
		for(Entry<String, String> sai: eg1.entrySet()) {
			System.out.println("sai:"+sai);
			
		}
	}

}
