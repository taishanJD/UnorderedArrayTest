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
	System.out.print("�գ�"+lastName);
	System.out.print("������"+firstName);
	System.out.println("�����䣺"+age);
    }
    
    public String getLastName() {
	return lastName;
    }
}
