package model;

public class Multiplicacao extends Operacao{
	
	public Multiplicacao (double a, double b, int segundosParaDormir) {
		super(a, b, segundosParaDormir);
		this.setName("MULTIPLICACAO");		
	}

	@Override
	public double calcular() {
		return this.getA() * this.getB();		
	}
}
