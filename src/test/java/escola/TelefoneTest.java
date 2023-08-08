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
	void deveCriarTelefonesComDddsValidos() {
		Telefone telefone = new Telefone("19", "34550101");
		assertNotNull(telefone);
	}
	
	@Test
	void naoDeveriaCriarTelefonesComNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("19", null));
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("19", ""));
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("19", "123456789"));
	}
	
	@Test
	void deveCriarTelefonesComNumerosValidos() {
		Telefone telefone1 = new Telefone("19", "991234567");
		assertNotNull(telefone1);
		
		Telefone telefone2 = new Telefone("19", "34550101");
		assertNotNull(telefone2);
	}
}
