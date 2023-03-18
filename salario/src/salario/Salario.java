package salario;

public class Salario {
	private String nome;
	private boolean vt;
	private double salario;
	
	public Salario(String nome, boolean vt, double salario) {
		this.nome = nome;
		this.vt = vt;
		this.salario = salario;
	}
	
	public void CalcSalario() {
		if (this.vt == true) {
			this.salario = this.salario * 0.94;
		} 
	}
	public void MostraSalario() {
		System.out.println(this.salario);
	}
}
