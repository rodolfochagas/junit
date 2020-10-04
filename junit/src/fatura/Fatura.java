package fatura;

import java.util.Date;

public class Fatura {
	
	public Date data;
	public double valorTotal;
	public String nomeDoCliente;
	public boolean pago;
	
	public Fatura(double valorTotal, String nomeDoCliente) {
		this.valorTotal = valorTotal;
		this.nomeDoCliente = nomeDoCliente;
	}
}
