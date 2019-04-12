package Elements;
import java.util.List;

public class Autostrada {
	public String codice, nome, tipo; 
	public List<Casello> Caselli;
	
	public Autostrada(String codice, String nome, String tipo, List<Casello> caselli) {
		this.codice = codice;
		this.nome = nome;
		this.tipo = tipo;
		this.Caselli = caselli;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public List<Casello> getCaselli() {
		return Caselli;
	}
	
	public void setCaselli(List<Casello> caselli) {
		Caselli = caselli;
	}

}
