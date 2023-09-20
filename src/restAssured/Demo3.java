package restAssured;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo3 {

	public static void main(String[] args) {
		  ArrayList<HashMap<String, Object>> list1 = new ArrayList<>();

	        HashMap<String, Object> dept1 = new HashMap<>();
	        dept1.put("ids", new int[] {2, 1, 3, 4, 5});
	        dept1.put("department", "IT");

	        HashMap<String, Object> dept2 = new HashMap<>();
	        dept2.put("ids", new int[] {22, 12, 32, 42, 52});
	        dept2.put("department", "IT");

	        list1.add(dept1);+-
	        list1.add(dept2);

	        HashMap<String, Object> empDetails = new HashMap<>();
	        empDetails.put("empId", 200);
	        empDetails.put("salary", 1000);

	        boolean active = true;

	        System.out.println("list1: " + list1);
	        System.out.println("empDetails: " + empDetails);
	        System.out.println("active: " + active);
	
	
	
	
	
	}

}
