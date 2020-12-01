package servicodetransporte;

import java.util.Scanner;

public class Exemplo {
	
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Informe a distância em Km: ");
			int distancia = entrada.nextInt();
			System.out.print("Qual o tipo de transporte? (1) Taxi, (2) Uber, (3) Pop: ");
			int opcaoTransporte = entrada.nextInt();
			TipoTransporte tipoTransporte = TipoTransporte.values()[opcaoTransporte - 1];
			
			Transportes transportes = tipoTransporte.obterValor();
			double preco = transportes.calculaPreco(distancia);
			System.out.printf("O valor total é de R$%.2f", preco);
		}
	}

}
