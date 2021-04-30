package odev3;

public class Main {

	public static void main(String[] args) {
		
		
		//User user = new User(1,"ayse","mehmetoglu","12345");
		User user = new User();
		user.setFirstName("yusuf");
		user.setId(3);
		System.out.println("kullanıcı adı: " + user.getFirstName());
		System.out.println("****************");
		
		//************* Student ************
		Student student = new Student();
		student.setStudentNumber("123456");
		System.out.println("öğrenci no: " + student.getStudentNumber());
		System.out.println("****************");
		
		Student student2 = new Student();
		student2.setFirstName("mert");
		student2.setLastName("karadeniz");
		student2.setId(2);
		student2.setPassword("şifre");
		student2.setStudentNumber("383462");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student2);
		
		Student student3 = new Student();
		student3.setFirstName("mehmet");
		student3.setLastName("mehmetoğlu");
		student3.setId(3);
		student3.setPassword("şifre11");
		student3.setStudentNumber("okulNo");
		
		
		Student [] students = {student2,student3};
		UserManager userManager = new UserManager();
		System.out.println("****************");
		System.out.println("SİSTEMDEKİ ÖĞRENCİLER");
		System.out.println("****************");
		userManager.showStudent(students);
		


		
		
		//*********** Instructor *************
//		Instructor instructor = new Instructor();
//		instructor.setCourse("java kursu");
//		System.out.println("Verdiği Kurs: " + instructor.getCourse());
		
		Instructor instructor2 = new Instructor();
		instructor2.setFirstName("zeynep");
		instructor2.setLastName("mehmetoglu");
		instructor2.setId(2);
		instructor2.setPassword("123456");
		instructor2.setCourse("python");
		
	
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor2);
		
		
	
	}

}
