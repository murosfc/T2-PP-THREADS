package model;

import java.util.concurrent.Semaphore;

public class Divisao extends Operacao{
	
	public Divisao (double a, double b, int vezes, int N, Semaphore semAtual, Semaphore semProximo) {
		super(a, b, vezes, N, semAtual, semProximo);
		this.setName("DIVISAO");		
	}
	
	public double calcular() {		
		return this.getA() / this.getB();
	}

	
}
