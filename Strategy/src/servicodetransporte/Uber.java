package servicodetransporte;

public class Uber implements Transportes {

	public double calculaPreco(int distancia) {
		return distancia * 0.90 + 5;
	}
	
}
