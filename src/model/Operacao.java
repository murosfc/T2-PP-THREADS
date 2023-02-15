package model;

public abstract class Operacao extends Thread{
	protected double a, b;
	protected int segundosParaDormir;	
	final int SECONDS_TO_MILISECONDS = 1000;
	
	@Override
	public void run() {
		final String blue = "\033[0;36m", green = "\033[0;32m";
		
		System.out.printf(blue + "Eu sou a Thread %s (%.0f) e vou dormir por %d segundos!\n", this.getName(), this.calcular(), this.getSegundosParaDormir());
		try{
			long millis = (long)(segundosParaDormir * SECONDS_TO_MILISECONDS);
			Thread.sleep(millis);		
		}
		catch (InterruptedException e) {
	        System.err.println("A Thread " + this.getName() + " foi interrompida por outro processo, erro: " + e.getMessage());
	    }
		System.out.printf(green + "Eu sou a Thread %s (%.0f). Ja se passaram %d segundos, entao terminei!\n", this.getName(), this.calcular(), this.getSegundosParaDormir());
	}
		
	protected Operacao(double a, double b, int segundosParaDormir) {
		this.a = a;
		this.b = b;
		this.segundosParaDormir = segundosParaDormir;
	}
	
	public abstract double calcular();
	
	protected double getA() {
		return a;
	}

	protected void setA(double a) {
		this.a = a;
	}

	protected double getB() {
		return b;
	}

	protected void setB(double b) {
		this.b = b;
	}	
	
	protected int getSegundosParaDormir() {
		return segundosParaDormir;
	}

	protected void setSegundosParaDormir(int segundosParaDormir) {
		this.segundosParaDormir = segundosParaDormir;
	}

}
