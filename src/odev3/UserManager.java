package odev3;

public class UserManager extends Student{
	
	public void showStudent (Student[] students) {
		
		for(Student student : students) {
			
			System.out.println(student.getFirstName() + " " + student.getLastName());
			System.out.println("****************");
			
		}
		
		
	}

}
