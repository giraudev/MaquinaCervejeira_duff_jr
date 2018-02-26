package br.com.ciclic;

public class Cerveja {

	private String estilo;
	private int temperaturaMinima;
	private int temperaturaMaxima;
	
	public Cerveja(String estilo, int temperaturaMinima, int temperaturaMaxima) {
		
		this.estilo = estilo;
		this.temperaturaMaxima = temperaturaMaxima;
		this.temperaturaMinima = temperaturaMinima;		
	}

	@Override
	public String toString() {
		return "Cerveja" + estilo;
	}

	public String getEstilo() {
		return estilo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estilo == null) ? 0 : estilo.hashCode());
		result = prime * result + temperaturaMaxima;
		result = prime * result + temperaturaMinima;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cerveja other = (Cerveja) obj;
		if (estilo == null) {
			if (other.estilo != null)
				return false;
		} else if (!estilo.equals(other.estilo))
			return false;
		if (temperaturaMaxima != other.temperaturaMaxima)
			return false;
		if (temperaturaMinima != other.temperaturaMinima)
			return false;
		return true;
	}

	public int getTemperaturaMinima() {
		return temperaturaMinima;
	}
	
}
