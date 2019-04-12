package Interfacce;

import Elements.Autostrada;
import Elements.Casello;
import Elements.Veicolo;

public interface GestionePedaggio {
	public Integer selezionePercorso(Casello partenza, Casello arrivo);
	public Integer selezionePedaggio(Veicolo v, Autostrada a);

}
