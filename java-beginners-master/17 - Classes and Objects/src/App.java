class Person {
     
    // Instance variables (data or "state")
    String name;
    int age;
     
     
    // Classes can contain
     
    // 1. Data
    // 2. Subroutines (methods)
}

class Student{
	
	

	String name;
	String section;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}

	
	/*
	 * @Override public String toString() { return "Student [name=" + name +
	 * ", section=" + section + "]"; }
	 * 
	 */
	
	
}
 
 
public class App {
 
    public static void main(String[] args) {
         
         
        // Create a Person object using the Person class
        Person person1 = new Person();  
        person1.name = "Joe Bloggs";
        person1.age = 37;
         
        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        
        Student std=new Student();
        std.setName("Prasad");
        std.setSection("C Sectoin");
        System.out.println(std);
         
        System.out.println(person1.name);
        System.out.print(std); 
    }
 
}