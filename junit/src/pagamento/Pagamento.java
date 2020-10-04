package pagamento;

import java.util.Date;

public class Pagamento {
	public double valorPago;
	public Date data;
	public String tipoDePagamento;
	
	public Pagamento(double valorPago, Date data, String tipoDePagamento) {
		this.valorPago = valorPago;
		this.data = data;
		this.tipoDePagamento = tipoDePagamento;
	}

}
