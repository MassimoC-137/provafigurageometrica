package it.prova.provafigurageometrica.model;

public class Figura {

	protected int base; 
	protected int altezza; 
	
//	costruttore default, costruttore parametri, get e set, alla fine metodi calcola con return -1
	
	public Figura() {
		
	}
	
	public Figura(int base, int altezza) {
		
		this.base = base; 
		this.altezza = altezza; 
	}
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base; 
	}
	
	public int getAltezza() {
		return altezza; 
	}
	
	public void setAltezza(int altezza) {
		this.altezza = altezza; 
	}
	
	public int CalcolaPerimetro() {
		return -1; 
	}
	
	public int CalcolaArea() {
		return -1; 
	}
	
	
}


