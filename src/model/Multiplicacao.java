package model;

import java.util.concurrent.Semaphore;

public class Multiplicacao extends Operacao{
	
	public Multiplicacao (double a, double b, int segundosDormir, int N, Semaphore semAtual, Semaphore semProximo) {
		super(a, b, segundosDormir, N, semAtual, semProximo);
		this.setName("MULTIPLICACAO");
		
	}
	
	public double calcular() {
		return this.getA() * this.getB();		
	}
}
