package com.personal.upskill.java8.streams;

import java.util.stream.Stream;

public class StreamEx10_InfiniteStream_Generate1 {

	public static void main(String[] args) {

		Stream<Department> departmentStream = Stream.generate(Department::new);
		departmentStream.limit(30).forEach(System.out::println);

	}

}

class Department {
	String departmentName;
	String departmentId;

	public Department(String departmentName, String departmentId) {
		super();
		this.departmentName = departmentName;
		this.departmentId = departmentId;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentId=" + departmentId + "]";
	}

	
}