package day19April;

import java.util.HashMap;
import java.util.Map;

public class SetDemo {

	public static void main(String[] args) {
		Map<String,String> hdfcbranch = new HashMap<>();
				
			
	hdfcbranch.put("Vidisha", "Madhya Pradesh");
	hdfcbranch.put("Bhopal", "Madhya pradesh");
	hdfcbranch.put("pune", "maharastra");
			
			//	System.out.println("hdfc" +  hdfcbranch);
			//	hdfcbranch.remove("Vidisha");
			//	System.out.println(hdfcbranch);
			//	hdfcbranch.get("Bhopal");
			//	System.out.println(hdfcbranch);
				hdfcbranch.size();
				System.out.println("hdfcbranch" + hdfcbranch);
				
				for(String i :hdfcbranch.keySet());
				{
					char[] i;
					System.out.println(i);	
				}
			
	}

}
