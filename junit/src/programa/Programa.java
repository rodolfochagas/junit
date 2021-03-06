package programa;

import java.util.ArrayList;
import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

public class Programa {
	
	public static void ProcessadorDeBoletos(ArrayList<Boleto> boletos, Fatura fatura) {
		double valorTotalPago = 0;
		
		for(Boleto boleto : boletos) {
			valorTotalPago += boleto.valorPago;
			Pagamento pagamento = new Pagamento(boleto.valorPago, boleto.data, "BOLETO");
			fatura.listaDePagamentos.add(pagamento);
		}
		
		if (valorTotalPago < fatura.valorTotal) {
			fatura.pago = false;
		}
		else {
			fatura.pago = true;
		}
		
	}

}
