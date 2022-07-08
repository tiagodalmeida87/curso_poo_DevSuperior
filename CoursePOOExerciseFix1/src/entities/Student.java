package entities;

public class Student {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double notaFinal() {
		return n1 + n2 + n3;
	}
	
	public double contagemNota () {
		if (notaFinal() < 60.00) {
			return 60.0 - notaFinal();
		} else {
			return 0.0;
		}
	}
}
