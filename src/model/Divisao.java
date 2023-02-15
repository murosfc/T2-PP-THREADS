package model;

public class Divisao extends Operacao{
	
	public Divisao (double a, double b, int segundosParaDormir) {
		super(a, b, segundosParaDormir);
		this.setName("DIVISAO");
		this.setResultado(this.calcular());
	}

	private final double calcular() {
		return this.getA() / this.getB();		
	}
}
