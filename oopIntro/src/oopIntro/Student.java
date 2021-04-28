package oopIntro;

//Kursa kayýt olmak istiyen öðrencilerin girmesi gereken bilgileri tutan sýnýf
public class Student {
	
	
	public Student(String emailAddress, String userName, String nameSurname, int passWord, String phoneNumber,
			double id) {
		super();
		this.emailAddress = emailAddress;
		this.userName = userName;
		this.nameSurname = nameSurname;
		this.passWord = passWord;
		this.phoneNumber = phoneNumber;
		this.id = id;
	}

	public Student() {
		
	}

	public void writeStudentInfo(Student student) {
		System.out.println("Öðrenci Bilgileri:");
		System.out.println(student.userName + " " + student.nameSurname + " " + student.phoneNumber + " " + student.emailAddress);
	}
	
	String emailAddress;
	String userName;
	String nameSurname;
	int passWord;
	String phoneNumber;
	double id;
}
