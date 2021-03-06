package es.cfc;

import java.util.Arrays;

import es.cfc.models.Carta;
import es.cfc.models.Numero;
import es.cfc.models.Palo;

public class Baraja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carta[] mano = new Carta[8];
		mano[0] = new Carta(Numero.UNO, Palo.OROS);
		mano[1] = new Carta(Numero.DOS, Palo.COPAS);
		mano[2] = new Carta(Numero.TRES, Palo.ESPADAS);
		mano[3] = new Carta(Numero.CUATRO, Palo.BASTOS);
		mano[4] = new Carta(Numero.SIETE, Palo.OROS);
		mano[5] = new Carta(Numero.SOTA, Palo.COPAS);
		mano[6] = new Carta(Numero.CABALLO, Palo.ESPADAS);
		mano[7] = new Carta(Numero.REY, Palo.BASTOS);
		
		String cartas = "";
		for (int i = 0; i < cartas.length(); i++) {
			String carta = mano[i].toString();
			if (carta == null) {
				continue;
			}
			cartas = cartas + carta.toString();
		}
		System.out.println(Arrays.toString(mano));
		
	}

}
