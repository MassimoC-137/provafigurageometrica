package it.prova.provafigurageometrica.model;

public class Quadrato extends Figura{

	public Quadrato() {
		
	}
	
	public Quadrato(int base, int altezza) {
		
		super(base, altezza); 
	}
	
	public int CalcolaPerimetro() {
		return super.base * 4; 
	}
	
	public int CalcolaArea() {
		return super.altezza * super.base; 
	}
	
}
