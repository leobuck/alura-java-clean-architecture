package escola;

public class Telefone {

	private String ddd;
	private String numero;
	
	public Telefone(String ddd, String numero) {
		if (ddd == null || numero == null) {
			throw new IllegalArgumentException("DDD e Número são obrigatórios.");
		}
		
		if (!ddd.matches("\\d{2}")) {
			throw new IllegalArgumentException("DDD inválido.");
		}
		
		if (!numero.matches("\\d{8}|\\d{9}")) {
			throw new IllegalArgumentException("Número inválido.");
		}
		
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
