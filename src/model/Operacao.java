package model;

public abstract class Operacao extends Thread{
	protected double a, b, resultado;
	protected int segundosParaDormir;	
	final int SECONDS_TO_MILISECONDS = 1000;
	
	@Override
	public void run() {
		System.out.printf("Eu sou a Thread %s (%.2f) e vou dormir por %d segundos!\n", this.getName(), this.getResultado(), this.getSegundosParaDormir());
		try{
			long millis = (long)(segundosParaDormir * SECONDS_TO_MILISECONDS);
			Thread.sleep(millis);		
		}
		catch (InterruptedException e) {
	        System.err.println("A Thread " + this.getName() + " foi interrompida inesperadamente, erro: " + e.getMessage());
	    }
		System.out.printf("Eu sou a Thread %s (%.2f). Já se passaram %d segundos, então terminei!\n", this.getName(), resultado, this.getSegundosParaDormir());
	}
		
	protected Operacao(double a, double b, int segundosParaDormir) {
		this.a = a;
		this.b = b;
		this.segundosParaDormir = segundosParaDormir;
	}
	
	public double getA() {
		return a;
	}

	protected void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	protected void setB(double b) {
		this.b = b;
	}	
	
	protected double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	protected int getSegundosParaDormir() {
		return segundosParaDormir;
	}

	protected void setSegundosParaDormir(int segundosParaDormir) {
		this.segundosParaDormir = segundosParaDormir;
	}

}
