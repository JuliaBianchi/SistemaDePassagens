import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sistema {
	
	public static void main(String[] args) {
		
		Aeroporto passoFundo = new Aeroporto();
		Aeroporto portoAlegre = new Aeroporto();
		
		List<String> veiculos = new ArrayList<String>();
		veiculos.add("Ônibus 01");
		veiculos.add("Avião 001");
		
		passoFundo.setCidade("Passo Fundo");
		passoFundo.setCodigo("PFA");
		passoFundo.setTamanhoPista(8.9);
		passoFundo.setVeiculoDeTransporte(veiculos);
		
		portoAlegre.setCidade("Porto Alegre");
		portoAlegre.setCodigo("POAB");
		portoAlegre.setTamanhoPista(8.9);
		portoAlegre.setVeiculoDeTransporte(veiculos);
		
		Cliente cliente01 = new Cliente();
		
		cliente01.setNome("Julia Bianchi");
		cliente01.setCpf("000.000.000-00");
		cliente01.setTelefone("99999-9999");
		
		Voo voo1 = new Voo();
	
		voo1.setNumero(01);
		voo1.setOrigem(passoFundo);
		voo1.setHoraPartida("23:30");
		voo1.setDataPartida(new Date(12/11/2021));
		voo1.setDestino(portoAlegre);
		voo1.setDataChegadaPrevista(new Date(13/11/2021));
		
		
		Passagem passagem1 = new Passagem();
		
		passagem1.setCliente(cliente01);
		passagem1.setValor(200);
		passagem1.setVoo(voo1);
		
		System.out.println("VOE PASSAGENS AÉREAS");
		
		System.out.println("--------------------");
		System.out.println("Cliente: "+ cliente01.getNome());
		System.out.println("CPF: " + cliente01.getCpf());
		System.out.println("Telefone: " + cliente01.getTelefone());
		System.out.println("--------------------");
		
		System.out.println("Número do Voo: " + voo1.getNumero());
		System.out.println("Origem: " + voo1.getOrigem());
		System.out.println("Horário de partida: " + voo1.getHoraPartida());
		System.out.println("Data de partida: " + voo1.getDataPartida());
		System.out.println("Destino: " + voo1.getDestino());
		System.out.println("Data chegada: " + voo1.getHoraChegadaPrevista());
		
		
		
	}

}
