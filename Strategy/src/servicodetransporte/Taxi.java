package servicodetransporte;

public class Taxi implements Transportes {

	public double calculaPreco(int distancia) {
		return distancia * 1.90 + 10;
	}
	
}
