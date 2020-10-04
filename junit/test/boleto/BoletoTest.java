package boleto;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fatura.Fatura;
import programa.Programa;

public class BoletoTest {
	
	Fatura fatura;
	ArrayList <Boleto> boletos;
	
	@BeforeEach
	public void inicializa() {
		fatura = new Fatura(300.0, "Fulano");
		boletos = new ArrayList<Boleto>();
	}
	
	@Test
	public void faturaPagaComUmBoleto() {
		Boleto boleto = new Boleto(300.0);
		boletos.add(boleto);
		
		Programa.ProcessadorDeBoletos(boletos, fatura);
		assertTrue(fatura.pago);
	}
	
	@Test
	public void faturaNaoPagaComUmBoleto() {
		Boleto boleto = new Boleto(200.0);
		boletos.add(boleto);
		
		Programa.ProcessadorDeBoletos(boletos, fatura);
		assertFalse(fatura.pago);
						
	}
	
	@Test
	public void faturaPagaComDoisBoletos() {
		Boleto boleto1 = new Boleto(200.0);
		Boleto boleto2 = new Boleto(100.0);
		
		boletos.add(boleto1);
		boletos.add(boleto2);
		
		Programa.ProcessadorDeBoletos(boletos, fatura);
		assertTrue(fatura.pago);
	}

}
