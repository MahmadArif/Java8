package com.personal.upskill.java8.constructorRef;

public class ConstructorRefEx2_TriArgConstructorRefernace{

	public static void main(String[] args) {
		TriArgConstruct triArgFnt1 = (name,age,salary) -> new PermanentEmployee(name, age, salary);
		System.out.println(triArgFnt1.createEmployee("ABC", 30, 10000.00));
		
		TriArgConstruct triArgFnt2 = PermanentEmployee::new;
		System.out.println(triArgFnt1.createEmployee("ABC", 30, 10000.00));
		
		TriArgConstructGeneric<String,Integer,Double,PermanentEmployee> triArgFnt3 = PermanentEmployee::new;
		System.out.println(triArgFnt3.createEmployee("ABC", 30, 10000.00));
		
		TriArgConstructGeneric<String,String,String,Department> triAgrDep = Department::new;
		System.out.println(triAgrDep.createEmployee("GRM", "QQ0130", "ABC"));
		
	}
	
}

@FunctionalInterface
interface TriArgConstruct{
	PermanentEmployee createEmployee(String name,int age,double salary);
}

@FunctionalInterface
interface TriArgConstructGeneric<T,U,V,R>{
	R createEmployee(T t,U u,V v);
}

class PermanentEmployee{
	private String name;
	private int age;
	private double  salary;
	
		
	public PermanentEmployee() {
		super();
	}
	public PermanentEmployee(String name) {
		super();
		this.name = name;
	}
	public PermanentEmployee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public PermanentEmployee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "RenualtEmployee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}


class Department{
	String name;
	String code;
	String head;
	
	
	public Department(String name, String code, String head) {
		super();
		this.name = name;
		this.code = code;
		this.head = head;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", code=" + code + ", head=" + head + "]";
	}
	
	
}
