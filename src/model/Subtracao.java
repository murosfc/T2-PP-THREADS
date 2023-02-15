package model;

public class Subtracao extends Operacao{
	
	public Subtracao (double a, double b, int segundosParaDormir) {
		super(a, b, segundosParaDormir);
		this.setName("MULTIPLICACAO");
		this.setResultado(this.calcular());
	}

	private final double calcular() {
		return this.getA() * this.getB();		
	}
}
