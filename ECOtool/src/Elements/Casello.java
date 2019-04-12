package Elements;
public class Casello {
	public String id, Citta;
	public Integer km;
	
	public Casello(String id, String citta, Integer km) {
		this.id = id;
		Citta = citta;
		this.km = km;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCitta() {
		return Citta;
	}
	
	public void setCitta(String citta) {
		Citta = citta;
	}
	
	public Integer getKm() {
		return km;
	}
	
	public void setKm(Integer km) {
		this.km = km;
	}
}
