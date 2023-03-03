package model;

import java.util.concurrent.Semaphore;

public class Multiplicacao extends Operacao{
	
	public Multiplicacao (double a, double b, int vezes, int N, Semaphore semAtual, Semaphore semProximo) {
		super(a, b, vezes, N, semAtual, semProximo);
		this.setName("MULTIPLICACAO");
		
	}
	
	public double calcular() {
		return this.getA() * this.getB();		
	}
}
