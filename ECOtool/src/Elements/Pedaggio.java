package Elements;

import Interfacce.GestionePedaggio;

public class Pedaggio implements GestionePedaggio {
	public String id, data;
	public Integer percorso, CostoTot;
	
	public Pedaggio(String id, String data, Autostrada a, Veicolo v, Casello partenza, Casello arrivo) {
		this.id = id;
		this.data = data;
		this.percorso = selezionePercorso(partenza, arrivo);
		this.CostoTot = selezionePedaggio(v, a);
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public Integer getPercorso() {
		return percorso;
	}
	
	public Integer setPercorso(Casello partenza, Casello arrivo) {
		return 0;
	}
	
	public Integer getPedaggio() {
		return CostoTot;
	}
	
	public Integer setPedaggio(Veicolo c, Autostrada a) {
		return 0;
	}

	@Override
	public Integer selezionePercorso(Casello partenza, Casello arrivo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selezionePedaggio(Veicolo v, Autostrada a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
