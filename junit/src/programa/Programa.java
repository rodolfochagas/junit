package programa;

import java.util.ArrayList;
import boleto.Boleto;
import fatura.Fatura;

public class Programa {
	
	public static void ProcessadorDeBoletos(ArrayList<Boleto> boletos, Fatura fatura) {
		fatura.pago = true;
	}

}
