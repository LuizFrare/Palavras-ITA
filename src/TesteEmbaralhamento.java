import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TesteEmbaralhamento {

	@Test
	public void testeEmbaralhadorUm() {

			EmbaralhadorUm e = new EmbaralhadorUm();
			String s = "teste";
			assertNotEquals(e.embaralhar(s), s);
	}
	
	@Test
	public void testeEmbaralhadorDois() {

			EmbaralhadorDois e = new EmbaralhadorDois();
			String s = "teste";
			assertEquals(e.embaralhar(s), "etset");
	}

}