package programa;

import java.util.ArrayList;
import boleto.Boleto;
import fatura.Fatura;

public class Programa {
	
	public static void ProcessadorDeBoletos(ArrayList<Boleto> boletos, Fatura fatura) {
		double valorTotalPago = 0;
		
		for(Boleto boleto : boletos) {
			valorTotalPago += boleto.valorPago;
		}
		
		if (valorTotalPago < fatura.valorTotal) {
			fatura.pago = false;
		}
		else {
			fatura.pago = true;
		}
		
	}

}
