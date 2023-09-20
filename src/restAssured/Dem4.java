package restAssured;

import java.util.ArrayList;
import java.util.HashMap;

public class Dem4 {
	 public static void main(String[] args) {
	        ArrayList<HashMap<String, Object>> employees = new ArrayList<>();

	        HashMap<String, Object> employee1 = new HashMap<>();
	        employee1.put("name", "cyber");
	        employee1.put("empId", 100);
	        employee1.put("salary", 20000);

	        HashMap<String, Object> employee2 = new HashMap<>();
	        employee2.put("name", "success");
	        employee2.put("empId", 1001);
	        employee2.put("salary", 200001);

	        HashMap<String, Object> employee3 = new HashMap<>();
	        employee3.put("name", "api");
	        employee3.put("empId", 1002);
	        employee3.put("salary", 20001);

	        employees.add(employee1);
	        employees.add(employee2);
	        employees.add(employee3);

	        HashMap<String, Object> data = new HashMap<>();
	        data.put("employees", employees);
	        data.put("city", "pune");
	        data.put("companyName", "TCS");

	        System.out.println("data: " + data);

}
}

