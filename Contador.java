package controleFluxo;
import java.util.Iterator;
import java.util.Scanner;

public class Contador {
	
	/**
	 *	No método principal, o sistema espera dois números digitados via terminal
	 *	e utiliza o método contar para fazer as operações indicados abaixo.
	 */
	
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o parâmetro um: ");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o parâmetro dois: ");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException parametroInvalido) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
		}
	}
	
	/**
	 *	Este método contar, é utilizado para realizar a subtração entre os parâmetros
	 *	dois e um  e contar os números de 1 ao resultado da subtração. Nele também, é
	 *	verificado se o parâmetro um é maior que o parâmetro dois, gerando uma exceção.
	 */
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {		
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		
		for (int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + (i+1));
		}
	}

}
