package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(null));
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(""));
		assertThrows(IllegalArgumentException.class, 
				() -> new Email("emailinvalido"));
	}
	
	@Test
	void deveriaPermitirCriarEmailComEnderecoValido() {
		String endereco = "leo@email.com";
		Email email = new Email(endereco);
		assertEquals(endereco, email.getEndereco());
	}
}
