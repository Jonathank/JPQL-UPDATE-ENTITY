/**
 * 
 */
package refactured.application;

import model.student.Student;
import refactured.studentUtilities.StudentRepository;

/**
 * @author JONATHAN
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student std = new Student();
		std.setFname("BAMUJJE");
		std.setLname("HERMAN");

		StudentRepository rep = new StudentRepository();

		
		rep.addStudent(std);
		System.out.println("\nADDED STUDENT  : " + std.toString());
		
		rep.findfirstnames().forEach(System.out::println);
		
		rep.findlasttnames().forEach(System.out::println);

		std = rep.findbyId(std.getId());
		System.out.println("\nFOUND STUDENT BY ID  : " + std.toString());
		
		rep.findStudent(std.getId());
		System.out.println("\nFOUND STUDENT  : " + std.toString());

		std.setFname("KING");
		std.setLname("NEUTON");
		rep.updateStudent(std);
		System.out.println("\nUPDATED STUDENT  : " + std.toString());

		std = rep.updateFirstName("KYEYUNE",std.getId());
		System.out.println("\nNEW UPDATED FIRST NAME  : >>>>" + std.toString());

		std = rep.updateLastName("HERMAN",std.getId());
		System.out.println("\nNEW UPDATED LAST NAME  : >>>>" + std.toString());

		rep.deleteStudent(std);
		System.out.println("\nDELETED STUDENT  : " + std.toString());
		

		rep.close();
	}

}
