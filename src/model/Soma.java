package model;

public class Soma extends Operacao{
	
	public Soma (double a, double b, int segundosParaDormir) {
		super(a, b, segundosParaDormir);
		this.setName("SOMA");		
	}

	@Override
	public double calcular() {
		return (this.getA() + this.getB());		
	}
}
