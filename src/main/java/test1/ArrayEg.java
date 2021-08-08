package test1;

import java.util.ArrayList;
import java.util.List;

public class ArrayEg {
 public static void main(String[] args) {
	 ArrayList<String> Eg1 = new ArrayList<String>();
	 Eg1.add("bhargav");
	 Eg1.add("sai");
	 Eg1.add("hyma");
	 Eg1.add("prasad");
	 System.out.println("Eg1:"+Eg1.toString());
	 System.out.println("Eg1:"+Eg1);
	 Eg1.indexOf("sai");
	 System.out.println("Eg1:"+ Eg1.indexOf("sai"));
	 System.out.println("Eg1:"+ Eg1.remove("sai"));
	// Eg1.clear();
	 System.out.println("Eg1:"+Eg1.toString());
	 ArrayList<String> Eg2 = (ArrayList<String>) Eg1.clone();
	 System.out.println("Eg2:"+Eg2.toString());
	 for(String value: Eg2) {
		 System.out.println(value);
	 }
	 System.out.println(Eg2.contains("bhargav"));
	 List<String> Abs = new ArrayList<String>();
	 
	 
 }
}
