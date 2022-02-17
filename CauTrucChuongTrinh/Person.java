package CauTrucChuongTrinh;

interface ActivitiesOfHuman{
	void eating();
	void sleeping();
}

abstract class Human implements ActivitiesOfHuman {
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}		
}

public class Person extends Human {
	
	public void eating() {
		System.out.println(getName() + " is eating ");
	}
	
	public void sleeping() {
		System.out.println(getName() + " is sleeping ");
	}
}

class Student extends Person{
	private int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	void display() {
		System.out.println("Hoc sinh " + getName() + " hoc lop " + grade);
	}
}

class main{
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("Nguyen");
		p1.eating();
		p1.sleeping();
		
		Person p2 = new Person();
		p2.setName("Pham");
		p2.eating();
		p2.sleeping();
		
		Student st1 = new Student();
		st1.setName("Tran");
		st1.setGrade(11);
		st1.display();
	}
}
