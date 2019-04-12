package Verifica;

import java.util.ArrayList;
import java.util.List;

import Elements.Autostrada;
import Elements.Casello;
import Elements.Pedaggio;
import Elements.Veicolo;
import Elements.VeicoloA;

public class Verifica {

	public static void main(String[] args) {
		
		Veicolo veicolo = new VeicoloA("ZX047LK", "supra", "nissan", 2008, 4, 2500, 15.0, 21.0, 1, 4.0, 5.0);
		Casello x1 = new Casello("c01", "New York", 66);
		Casello x2 = new Casello("c02", "Los Angeles", 167);
		Casello x3 = new Casello("c03", "Londra", 210);
		List<Casello> Caselli = new ArrayList<Casello>();
		Caselli.add(x1);
		Caselli.add(x2);
		Caselli.add(x3);
		Autostrada autostrada = new Autostrada("R4", "Autostrada Mohave", "Deserto", Caselli);
		Pedaggio p = new Pedaggio("1", "20/03/09", autostrada, veicolo, x1, x2);

	}

}
