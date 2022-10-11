package org.sample;

import java.util.*;

public class Company {
	
	
	
	public static void main(String[] args) {
		
		Map<String , Integer>  m =new HashMap();   // random order 
		
	    m.put("dhinesh", 14);
	    m.put("shiva", 16);
	    m.put("krizz", 17);
	    m.put("priya ", 18);
	    m.put("shiva", 100);
	    m.put(null, 12);
	    m.put(null, null);
	    m.put("mano", null);
	    
	System.out.println(m);
		
	Map<String , Integer>  m1=new LinkedHashMap();// insertion order 
	
	  m1.put("dhinesh", 14);
	    m1.put("shiva", 16);
	    m1.put("krizz", 17);
	    m1.put("priya ", 18);
	    m1.put("shiva", 100);
	    m1.put(null, 12);
	    m1.put(null, null);
	    m1.put("mano", null);
	    
	    System.out.println(m1);
	    
	    Map<String , Integer>  m2=new TreeMap();	//asending order
	    
	    m2.put("dhinesh", 14);
	    m2.put("shiva", 16);
	    m2.put("krizz", 17);
	    m2.put("priya ", 18);
	    m2.put("shiva", 100);
	    m2.put("b", 12);
	    m2.put("a", null);
	    m2.put("mano", null);
	     
	System.out.println(m2);	
		
	  Map<String , Integer>  m3=new Hashtable(); //random
	  
	  m3.put("dhinesh", 14);
	    m3.put("shiva", 16);
	    m3.put("krizz", 17);
	    m3.put("priya ", 18);
	    m3.put("shiva", 100);
	    m3.put("b", 12);
	    m3.put("a", 0);
	    m3.put("mano", 0 );
	     
	System.out.println(m3);	
		
		//method is map 
		
		Integer integer = m2.get("shiva");
		
		System.out.println(integer);
		
		int size = m2.size();
		System.out.println(size);
		
		
		Integer remove = m2.remove("priya");
		System.out.println(remove);
		System.out.println(m2);
		
		Integer remove2 = m2.remove("dhinesh");
		System.out.println(remove2);
		System.out.println(m2);
		
		
		Collection<Integer> values = m2.values();
		System.out.println(values);
		
		Set<String> keySet = m2.keySet();
		System.out.println(keySet);
		
		boolean containsKey = m2.containsKey("mano");
		System.out.println(containsKey);
	}
	
	
	

}
