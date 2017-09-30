package prova;
import java.time.LocalDateTime;

public class Ligacao {
	// NTD = Número de telefone de destino, DHI = Data e hora de início, DHF = Data e hora de fim, CD = Cidade de destino
private int codigo;
private String NTD;
private LocalDateTime DHI;
private LocalDateTime DHF;
private String CD;
private String UF;
private Cliente cliente;

public Ligacao(int i, String nTD, LocalDateTime dHI, LocalDateTime dHF, String cD, String uF, Cliente cliente) {
	this.codigo = i;
	NTD = nTD;
	DHI = dHI;
	DHF = dHF;
	CD = cD;
	UF = uF;
	this.cliente = cliente;
	
	
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNTD() {
	return NTD;
}

public void setNTD(String nTD) {
	NTD = nTD;
}

public LocalDateTime getDHI() {
	return DHI;
}

public void setDHI(LocalDateTime dHI) {
	DHI = dHI;
}

public LocalDateTime getDHF() {
	return DHF;
}

public void setDHF(LocalDateTime dHF) {
	DHF = dHF;
}

public String getCD() {
	return CD;
}

public void setCD(String cD) {
	CD = cD;
}

public String getUF() {
	return UF;
}

public void setUF(String uF) {
	UF = uF;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}


}
