package boleto;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fatura.Fatura;
import programa.Programa;

public class BoletoTest {
	
	ArrayList <Boleto> boletos;
	
	@BeforeEach
	public void inicializa() {
		boletos = new ArrayList<Boleto>();
	}
	
	@Test
	public void faturaPaga() {
		Fatura fatura = new Fatura(300.0, "Fulano");
		Boleto boleto = new Boleto(300.0);
		
		boletos.add(boleto);
		
		Programa.ProcessadorDeBoletos(boletos, fatura);
		assertTrue(fatura.pago);
	}
	
	@Test
	public void faturaNaoPaga() {
		Fatura fatura = new Fatura(300.0, "Fulano");
		Boleto boleto = new Boleto(200.0);
		
		boletos.add(boleto);
		
		Programa.ProcessadorDeBoletos(boletos, fatura);
		assertFalse(fatura.pago);
						
	}
	

}
