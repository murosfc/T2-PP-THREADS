package model;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double a = 0, b = 0;			
		int dormirSegundos = gerarAleatorio();
		lerDoTeclado(a , b);
		
		Soma soma = new Soma(a, b, dormirSegundos);
		Subtracao subtracao = new Subtracao(a, b, dormirSegundos);
		Multiplicacao multiplicacao = new Multiplicacao(a, b, dormirSegundos);
		Divisao divisao = new Divisao(a, b, dormirSegundos);
		
		soma.run();
		subtracao.run();
		multiplicacao.run();
		divisao.run();
	}

	static void lerDoTeclado(double a, double b) {
	    Scanner scanner = new Scanner(System.in);
	    while (a <= 0 || b <= 0) {
	        if (a <= 0) {
	            System.out.print("Digite um valor para 'a' maior que zero: ");
	            a = scanner.nextDouble();
	        }
	        if (b <= 0) {
	            System.out.print("Digite um valor para 'b' maior que zero: ");
	            b = scanner.nextDouble();
	        }
	    }
	}
	
	static int gerarAleatorio() {
		Random random = new Random();
		return random.nextInt(20) + 1;
	}

}
