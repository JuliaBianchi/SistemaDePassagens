package br.imed.poo.passagem;

import br.imed.poo.cliente.Cliente;
import br.imed.poo.voo.Voo;

public class Passagem {
	private int idPassagem;
	private int fileira;
	private char poltrona;
	private String formaPagamento;
	private Cliente cliente;
	private int vooId;
	private Voo voo;
	
	
	
	public Passagem(int idPassagem, int fileira, char poltrona, String formaPagamento, Cliente cliente, int vooId,
			Voo voo) {
		super();
		this.idPassagem = idPassagem;
		this.fileira = fileira;
		this.poltrona = poltrona;
		this.formaPagamento = formaPagamento;
		this.cliente = cliente;
		this.vooId = vooId;
		this.voo = voo;
	}
	
	public int getId() {
		return idPassagem;
	}
	public void setId(int id) {
		this.idPassagem = id;
	}
	public int getFileira() {
		return fileira;
	}
	public void setFileira(int fileira) {
		this.fileira = fileira;
	}
	public char getPoltrona() {
		return poltrona;
	}
	public void setPoltrona(char poltrona) {
		this.poltrona = poltrona;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getVooId() {
		return vooId;
	}
	public void setVooId(int vooId) {
		this.vooId = vooId;
	}
	public Voo getVoo() {
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}

}
