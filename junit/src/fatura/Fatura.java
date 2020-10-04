package fatura;

import java.util.ArrayList;
import java.util.Date;

import pagamento.Pagamento;

public class Fatura {
	
	public Date data;
	public double valorTotal;
	public String nomeDoCliente;
	public boolean pago;
	public ArrayList <Pagamento> listaDePagamentos = new ArrayList<Pagamento>();
	
	public Fatura(double valorTotal, String nomeDoCliente) {
		this.valorTotal = valorTotal;
		this.nomeDoCliente = nomeDoCliente;
	}
}
