

import java.util.Date;

public class Voo {

	private Integer numero;
	private Aeroporto origem;
	private Aeroporto destino;
	private Date dataPartida;
	private String horaPartida;
	private Date dataChegadaPrevista;
	private String horaChegadaPrevista;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Aeroporto getOrigem() {
		return origem;
	}
	public void setOrigem(Aeroporto origem) {
		this.origem = origem;
	}
	public Aeroporto getDestino() {
		return destino;
	}
	public void setDestino(Aeroporto destino) {
		this.destino = destino;
	}
	public Date getDataPartida() {
		return dataPartida;
	}
	public void setDataPartida(Date dataPartida) {
		this.dataPartida = dataPartida;
	}
	public String getHoraPartida() {
		return horaPartida;
	}
	public void setHoraPartida(String horaPartida) {
		this.horaPartida = horaPartida;
	}
	public Date getDataChegadaPrevista() {
		return dataChegadaPrevista;
	}
	public void setDataChegadaPrevista(Date dataChegadaPrevista) {
		this.dataChegadaPrevista = dataChegadaPrevista;
	}
	public String getHoraChegadaPrevista() {
		return horaChegadaPrevista;
	}
	public void setHoraChegadaPrevista(String horaChegadaPrevista) {
		this.horaChegadaPrevista = horaChegadaPrevista;
	}
	

	
}
