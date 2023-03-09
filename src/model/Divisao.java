package model;

import java.util.concurrent.Semaphore;

public class Divisao extends Operacao{
	
	public Divisao (double a, double b, int segundosDormir, int N, Semaphore semAtual, Semaphore semProximo) {
		super(a, b, segundosDormir, N, semAtual, semProximo);
		this.setName("DIVISAO");		
	}
	
	public double calcular() {		
		return this.getA() / this.getB();
	}

	
}
