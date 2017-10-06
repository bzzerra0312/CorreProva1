package prova;

import java.util.ArrayList;

public class Principal {
//Aluno: Renan Bezerra de Almeida     RA:21709290
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BDSimulado bd= new BDSimulado();
		System.out.println(bd.getInfoCliente("Evandro da Silva"));
		
		ArrayList<Ligacao> a1 = bd.ligacoesPorCliente("Maria do Socorro");
		System.out.println(a1);
		
		
		
	}

}
