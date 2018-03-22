package lab3;

public class PersonTest {

	public static void main(String[] args){
	
		Person p;
		p = new Person("Sally", 34);
		
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
		System.out.println("Name Length: "+ p.getNameLength());
	  

	}
}
