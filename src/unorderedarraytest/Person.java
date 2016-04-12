package unorderedarraytest;

public class Person {

    private String lastName;
    private String firstName;
    private int age;
    
    public Person(String lastName, String firstName, int age) {
	super();
	this.lastName = lastName;
	this.firstName = firstName;
	this.age = age;
    }
    
    public void showPerson() {
	System.out.print("ĞÕ£º"+lastName);
	System.out.print("£¬Ãû£º"+firstName);
	System.out.println("£¬ÄêÁä£º"+age);
    }
    
    public String getLastName() {
	return lastName;
    }
}
