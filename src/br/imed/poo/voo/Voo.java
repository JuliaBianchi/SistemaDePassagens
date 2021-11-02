package br.imed.poo.voo;

import java.util.ArrayList;
import java.util.Date;

import br.imed.poo.passagem.Passagem;

public class Voo {
	private int idVoo;
	private int numero;
	private String origem;
	private String destino;
	private Date dataPartida;
	private Date horaPartida;
	private Date dataChegadaPrevista;
	private Date horaChegadaPrevista;
	private ArrayList<Passagem> passagens;
	
	public int getIdVoo() {
		return idVoo;
	}
	public void setIdVoo(int idVoo) {
		this.idVoo = idVoo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Date getDataPartida() {
		return dataPartida;
	}
	public void setDataPartida(Date dataPartida) {
		this.dataPartida = dataPartida;
	}
	public Date getHoraPartida() {
		return horaPartida;
	}
	public void setHoraPartida(Date horaPartida) {
		this.horaPartida = horaPartida;
	}
	public Date getDataChegadaPrevista() {
		return dataChegadaPrevista;
	}
	public void setDataChegadaPrevista(Date dataChegadaPrevista) {
		this.dataChegadaPrevista = dataChegadaPrevista;
	}
	public Date getHoraChegadaPrevista() {
		return horaChegadaPrevista;
	}
	public void setHoraChegadaPrevista(Date horaChegadaPrevista) {
		this.horaChegadaPrevista = horaChegadaPrevista;
	}
	public ArrayList<Passagem> getPassagens() {
		return passagens;
	}
	public void setPassagens(ArrayList<Passagem> passagens) {
		this.passagens = passagens;
	}
	
	

}
