import TestPackage.Employee;
import TestPackage.Person;
import TestPackage.Selfable;
import TestPackage.Student;

public class Test {
	public static void main(String[] args){
//		String str = new String("hello world");
//		System.out.println(str);

		Person person = new Person("ndfdsfsdfame");
		//System.out.println(person.getName());
		person.setName("babab");
		//System.out.println(person.getName());
		//System.out.println(Person.getStaticName("hi"));
	
	Person person2 = new Student("dk");
	person2.whoAmI();
	Person person3 = new Person("jh");
	person3.whoAmI();
	Person person4 = new Employee("babo", "samsung");
	person4.whoAmI();
	Selfable person5 = new Person("a");
	Selfable person6 = new Student("a");
	Selfable person7 = new Employee("hi","a");
	person5.whoAmI();
	System.out.println("----");
	person6.whoAmI();

	System.out.println("----");
	person7.whoAmI();
	}
}
