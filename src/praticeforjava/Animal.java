package praticeforjava;

public class Animal {
	String place;
	int type; 
		static void  animalSound() {
			String name ;					
			float weight;
			
			System.out.println("The animal makes sound");
				name = "pink pig";
				weight =97.5f;    
				System.out.println("name : "  + name + " : " +  " weight : " + weight);
				
			
			
		}

}
class pig extends Animal{
	public void animalSound() {
		System.out.println("pig sound 'wee wee' ");
	}
}
class dog extends Animal {
	public void animalSound() { 
		System.out.println("dog sound 'bu bu' ");
	}
}
class main{
	public static void main (String[]args) {
		Animal myAnimal = new Animal();
		Animal myPig = new pig();
		Animal myDog = new dog();
		
		myAnimal.animalSound();
	
	//	myDog.animalSound();
		
		Animal s1 = new Animal();
		int a = s1.type;
		System.out.println(a);
		String b = s1.place;
		System.out.println(b);
		myPig.animalSound();
		
		
		
	}
}







