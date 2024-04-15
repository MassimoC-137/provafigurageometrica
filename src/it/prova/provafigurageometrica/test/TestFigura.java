package it.prova.provafigurageometrica.test;

import it.prova.provafigurageometrica.model.Figura;
import it.prova.provafigurageometrica.model.Quadrato;
import it.prova.provafigurageometrica.model.TriangoloEquilatero;

public class TestFigura {

	public static void main(String[] args) {
		

		
		Figura fig1 = new Quadrato(4, 4) ; 
		Figura fig2 = new TriangoloEquilatero(4, 4);
		
		System.out.println(fig1.CalcolaArea());
		System.out.println(fig1.CalcolaPerimetro());
		
		System.out.println(fig2.CalcolaArea());
		System.out.println(fig2.CalcolaPerimetro());

	}

}
