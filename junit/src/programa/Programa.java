package programa;

import java.util.ArrayList;
import boleto.Boleto;
import fatura.Fatura;

public class Programa {
	
	public static void ProcessadorDeBoletos(ArrayList<Boleto> boletos, Fatura fatura) {
		if (boletos.get(0).valorPago < fatura.valorTotal) {
			fatura.pago = false;
		}
		else {
			fatura.pago = true;
		}
		
	}

}
