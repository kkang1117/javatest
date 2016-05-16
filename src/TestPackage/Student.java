package TestPackage;

public class Student extends Person{
	private String school;
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Student(String name,String school){
		this(name); // 자바에서 컨스트럭트 this컨스터럭트는 첫번쨰 줄에서 호출해줘야한다.!!!
		this.school = school;
	}
	// overloading 한 클래스내에서 메소드네임이 같은 메소드를 메소드네임을 제외하면 메소드 시그니처(파라미터)
	 // overriding 상속구조에서 부모의 메소드를 자식에서 재정의한다.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((school == null) ? 0 : school.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (school == null) {
			if (other.school != null)
				return false;
		} else if (!school.equals(other.school))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [school=" + school + "]";
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

@Override
public void whoAmI() {
	// TODO Auto-generated method stub
//	super.whoAmI();
	System.out.println("School is " + getSchool());
}}
