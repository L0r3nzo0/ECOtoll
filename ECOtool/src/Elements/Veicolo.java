package Elements;

public class Veicolo {
	public String targa, modello, marca; 
	public Integer anno, assi, peso, euro; 
	public double altezza, emissioniCO2;  
	
	public Veicolo(String targa, String modello, String marca, Integer anno, Integer assi, Integer peso,
			Double altezza, Double emissioniCO2, Integer euro) {
		this.targa = targa;
		this.modello = modello;
		this.marca = marca;
		this.anno = anno;
		this.assi = assi;
		this.peso = peso;
		this.altezza = altezza;
		this.emissioniCO2 = emissioniCO2;
		this.euro = euro;
	}
	
	public Integer getEuro() {
		return euro;
	}

	public void setEuro(Integer euro) {
		this.euro = euro;
	}

	public String getTarga() {
		return targa;
	}
	
	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Integer getAnno() {
		return anno;
	}
	
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	
	public Integer getAssi() {
		return assi;
	}
	
	public void setAssi(Integer assi) {
		this.assi = assi;
	}
	
	public Integer getPeso() {
		return peso;
	}
	
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
	public Double getAltezza() {
		return altezza;
	}
	
	public void setAltezza(Integer altezza) {
		this.altezza = altezza;
	}
	
	public Double getEmissioniCO2() {
		return emissioniCO2;
	}
	
	public void setEmissioniCO2(Integer emissioniCO2) {
		this.emissioniCO2 = emissioniCO2;
	}
}
