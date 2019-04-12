package Elements;
public class VeicoloD extends Veicolo {
	public Double tariffa, prezzoExtra;
	
	public VeicoloD(String targa, String modello, String marca, Integer anno, Integer assi, Integer peso,
	Double altezza, Double emissioniCO2, Integer euro, Double tariffa, Double prezzoExtra) {
		super(targa, modello, marca, anno, assi, peso, altezza, emissioniCO2, euro);
		this.tariffa = tariffa;
		this.prezzoExtra = prezzoExtra;
	}
	
	public Double getTariffa() {
		return tariffa;
	}
	
	public void setTariffa(Double tariffa) {
		this.tariffa = tariffa;
	}
	
	public Double getprezzoExtra() {
		return prezzoExtra;
	}
	
	public void setprezzoExtra(Double prezzoExtra) {
		this.prezzoExtra = prezzoExtra;
	}
}
