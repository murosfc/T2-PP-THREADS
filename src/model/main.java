package model;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class main {	

	public static void main(String[] args) {			
		double a = 0, b = 0;
		int N = 0 ;
		
		//leitura dos valores
		Scanner scanner = new Scanner(System.in);
		
		while (N <= 0) {
			System.out.print("Digite o numero de vezes 'N' onde N >= 1): ");
			N = scanner.nextInt();
		}
		
		System.out.print("Digite um valor para 'a': ");
        a = scanner.nextDouble();
        
		while (b == 0) {
            System.out.print("Digite um valor para 'b' onde (b != 0): ");
            b = scanner.nextDouble();
        }		
		System.out.print("\n");
		
		/* Criação dos semáforos para controlar a ordem de execução das threads.
		 A soma inicia com 1 para conceder premissão ao thread que solicitam acesso ao recurso.
		 Quando a thread que adquiriu a permissão do semáforo semSo terminar de executar sua seção crítica,
		 ela liberará o semáforo e permitirá que uma das outras threads (que estiverem esperando)
		 possam adquirir a permissão e executar sua própria seção crítica.
		 Esse processo será repetido até que todas as threads tenham executado suas seções críticas.*/
        Semaphore semSo = new Semaphore(1);
        Semaphore semSu = new Semaphore(0);
        Semaphore semMu = new Semaphore(0);
        Semaphore semDi = new Semaphore(0);
        
        // criação das threads para realizar as operações
        // passando a atual e a próxima
		Soma soma = new Soma(a, b, gerarAleatorio(), N, semSo, semSu);
		Subtracao subtracao = new Subtracao(a, b, gerarAleatorio(), N, semSu, semMu);
		Multiplicacao multiplicacao = new Multiplicacao(a, b, gerarAleatorio(), N, semMu, semDi);
		Divisao divisao = new Divisao(a, b, gerarAleatorio(), N, semDi, semSo ); 
		
		soma.start();
		subtracao.start();
		multiplicacao.start();
		divisao.start();  		
	}
	
	static int gerarAleatorio() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}
