package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void naoDeveriaCriarTelefonesComDddsInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone(null, "34550101"));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("", "34550101"));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("1", "34550101"));
	}
	
	@Test
	void naoDeveriaCriarTelefonesComNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("19", null));
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("19", ""));
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("19", "15478"));
	}
	
	@Test
	void deveriaPermitirCriarTelefoneComDDDENumeroValidos() {
		String ddd = "11";
		String numero = "123456789";
		
		Telefone telefone = new Telefone(ddd, numero);
		assertEquals(ddd, telefone.getDdd());
		assertEquals(numero, telefone.getNumero());
	}
}
