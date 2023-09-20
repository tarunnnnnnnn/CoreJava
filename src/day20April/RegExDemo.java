package day20April;



import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExDemo {

	public static void main(String[] args) {
			Pattern ptn = Pattern.compile("myNameIsTarun");
			Matcher matcher = ptn.matcher("myNameIs		Tarun");
		boolean matchFound = matcher.find();
			
			if (matchFound) {
				System.out.println("is correct");
			}
			
			else {
				System.out.println("is not correct");
			
			}
	}

}
