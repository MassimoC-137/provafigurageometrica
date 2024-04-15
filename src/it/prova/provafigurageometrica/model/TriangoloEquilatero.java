package it.prova.provafigurageometrica.model;

public class TriangoloEquilatero extends Figura{

	public TriangoloEquilatero() {
		
	}
	
	public TriangoloEquilatero(int base, int altezza) {
		
		super(base, altezza); 
	}
	
	public int CalcolaPerimetro() {
		return super.base * 3; 
	}
	
	public int CalcolaArea() {
		return super.altezza * super.base / 2; 
	}
	
	
}
