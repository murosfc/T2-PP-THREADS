package model;

public class Divisao extends Operacao{
	
	public Divisao (double a, double b, int segundosParaDormir) {
		super(a, b, segundosParaDormir);
		this.setName("DIVISAO");		
	}

	@Override
	public double calcular() {		
		return this.getA() / this.getB();
	}

	
}
