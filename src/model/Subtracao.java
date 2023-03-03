package model;

import java.util.concurrent.Semaphore;

public class Subtracao extends Operacao{
	
	public Subtracao (double a, double b, int vezes, int N, Semaphore semAtual, Semaphore semProximo) {
		super(a, b, vezes, N, semAtual, semProximo);
		this.setName("SUBTRACAO");
	}

	public double calcular() {
		return this.getA() - this.getB();		
	}
}
