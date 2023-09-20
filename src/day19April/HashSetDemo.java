package day19April;

import java.util.HashMap;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashMap<String ,Integer> people = new HashMap<String,Integer>();
		
		people.put("Dhoni",  5);
		people.put("Jadeja",  47);
		people.put("raina",  48);
		
		for(String i :people.keySet()) {
			System.out.println("key " + i  + " Value " +  people.get(i));	
		}
		
			
		
		
	}

}
