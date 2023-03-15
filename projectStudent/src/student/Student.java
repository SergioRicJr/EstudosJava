package student;

public class Student {
	private String name;
	private int media;
	private int studentId;
	private String ssn = "n";
	private double gpa;
	
	public Student(int studentId, String name, String ssn) {
		this.name = name;
		this.studentId = studentId;
		this.ssn = ssn;
	}
	// @override faz que metodo possa ser sobrescrevido sem problemas
	// podendo permitir que objeto seja instanciado com ou sem parametros definidos
}
