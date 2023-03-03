package model;

import java.util.concurrent.Semaphore;

public class Soma extends Operacao{
	
	public Soma (double a, double b, int vezes, int N, Semaphore semAtual, Semaphore semProximo) {
		super(a, b, vezes, N, semAtual, semProximo);
		this.setName("SOMA");	
	}
	
	public double calcular() {
		return (this.getA() + this.getB());		
	}
}
