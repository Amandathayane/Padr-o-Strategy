package servicodetransporte;

public class Pop implements Transportes {
	
	public double calculaPreco(int distancia) {
		return distancia * 0.60 + 5;
	}

}
