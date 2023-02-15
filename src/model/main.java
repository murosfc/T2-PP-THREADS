package model;

import java.util.Random;
import java.util.Scanner;

public class main {	

	public static void main(String[] args) {			
		double a = 0, b = 0;		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um valor para 'a': ");
        a = scanner.nextDouble();
		while (b <= 0) {
            System.out.print("Digite um valor para 'b' maior que zero: ");
            b = scanner.nextDouble();
        }
		System.out.print("\n");
		Soma soma = new Soma(a, b, gerarAleatorio());
		Subtracao subtracao = new Subtracao(a, b, gerarAleatorio());
		Multiplicacao multiplicacao = new Multiplicacao(a, b, gerarAleatorio());
		Divisao divisao = new Divisao(a, b, gerarAleatorio());
		
		soma.start();
		subtracao.start();
		multiplicacao.start();
		divisao.start();		
	}	
	
	static int gerarAleatorio() {
		Random random = new Random();
		return random.nextInt(20) + 1;
	}	

}
