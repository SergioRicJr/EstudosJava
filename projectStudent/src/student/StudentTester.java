package student;

public class StudentTester {
	
	public static void main(String[] args) {
		//st1 é do tipo estudante, Studente st1 = Student()
		Student st1 = new Student(1, "Juninho", "xxxxxx");
		Student.printa();
		// Student.printaa(); static torna chamavel mesmo sem instanciar classe
		System.out.println(st1);
	}
}
