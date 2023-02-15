package model;

public class Soma extends Operacao{
	
	public Soma (double a, double b, int segundosParaDormir) {
		super(a, b, segundosParaDormir);
		this.setName("SOMA");
		System.err.println(this.calcular());
		this.setResultado(this.calcular());
	}

	private final double calcular() {
		return (this.getA() + this.getB());		
	}
}
