package oopIntro;

public class Course {
	
	public Course(String name, String content, int id, int teacherId) {
		super();
		this.name = name;
		this.content = content;
		this.id = id;
		this.teacherId = teacherId;
	}
	
	public Course(){
		
	}
	
	public void printAllCourses(Course[] courses) {
		System.out.println("Tüm Kurslarýmýz");
		for (Course course : courses) {
			System.out.println(course.name + " " + course.content);
		}
	}
	
	String name;
	String content;
	int id;
	int teacherId;
}
