package model;

import java.util.concurrent.Semaphore;

public class Subtracao extends Operacao{
	
	public Subtracao (double a, double b, int segundosDormir, int N, Semaphore semAtual, Semaphore semProximo) {
		super(a, b, segundosDormir, N, semAtual, semProximo);
		this.setName("SUBTRACAO");
	}

	public double calcular() {
		return this.getA() - this.getB();		
	}
}
