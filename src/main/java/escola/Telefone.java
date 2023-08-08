package escola;

public class Telefone {

	private String ddd;
	private String numero;
	
	public Telefone(String ddd, String numero) {
		if (ddd == null || !ddd.matches("^[1-9]{2}")) {
			throw new IllegalArgumentException("DDD inválido.");
		}
		
		if (numero == null || !numero.matches("(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$")) {
			throw new IllegalArgumentException("Número inválido.");
		}
		
		this.ddd = ddd;
		this.numero = numero;
	}
	
}
