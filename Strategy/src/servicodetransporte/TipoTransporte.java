package servicodetransporte;


//enum é um tipo de fábrica de objetos

public enum TipoTransporte {
	
	TAXI {
		@Override
		public Transportes obterValor() {
			return new Taxi();
		}
	},
	UBER {
		@Override
		public Transportes obterValor() {
			return new Uber();
		}
	},
	POP {
		@Override
		public Transportes obterValor() {
			return new Pop();
		}
	};
	
	public abstract Transportes obterValor();
}
