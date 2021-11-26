public class Passagem {
	
	private Voo voo;
	private Cliente cliente;
	private double valor;

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Voo getVoo() {
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
