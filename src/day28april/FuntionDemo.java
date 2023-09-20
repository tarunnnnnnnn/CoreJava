package day28april;
import java.util.function.Function;

public class FuntionDemo {
	public static void main(String[] args) {
		Function <Integer,Integer> f = sal -> sal*12;
		System.out.println("rs " + f.apply(600000));
		
		Function<String,String> f1 = str -> str.concat("is an automation tester");
		System.out.println(f1.apply("Tarun"));
	}
}
		
		
			
