package boleto;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import fatura.Fatura;
import programa.Programa;

public class BoletoTest {
	
	@Test
	public void test() {
		Fatura fatura = new Fatura(300.0, "Fulano");
		Boleto boleto = new Boleto(300.0);
		ArrayList <Boleto> boletos = new ArrayList<Boleto>();
		boletos.add(boleto);
		
		Programa.ProcessadorDeBoletos(boletos, fatura);
		assertTrue(fatura.pago);
		
	}

}
