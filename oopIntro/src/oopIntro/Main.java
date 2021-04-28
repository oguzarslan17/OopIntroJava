package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Elektronik";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev-Bahçe";
		
		Student student = new Student();
		Student student1 = new Student("sample@gmail.com","user1","User Userson",5,"23423400",123244356);
		Student student2 = new Student("sample@gmail.com","user2","User Userson",5,"23423400",123244356);
		Student student3 = new Student("sample@gmail.com","user3","User Userson",5,"23423400",123244356);
		student.writeStudentInfo(student1);
		student.writeStudentInfo(student2);
		student.writeStudentInfo(student3);
		System.out.println("------");
		
		Course course = new Course();
		Course course1 = new Course("Java/React","Spring Boot/Javascript Library",121334,21234123);
		Course course2 = new Course("C#/Angular",".NetCore/Javascript Library",123213, 21234123);
		Course[] courses = {course1, course2};
		course.printAllCourses(courses);
	}

}
