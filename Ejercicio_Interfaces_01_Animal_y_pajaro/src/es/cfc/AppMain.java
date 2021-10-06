package es.cfc;

import es.cfc.models.Pajaro;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pajaro pajaro = new Pajaro(10, "bosque", "Carpintero", false, "pio");
		pajaro.habitar();
		pajaro.emitirSonido();
		pajaro.esperanzaVida();
		System.out.println(pajaro.toString());

		Pajaro piolin = new Pajaro(6, "jaula", "Piolín", true, "Me pareció ver un lindo gatito");
		piolin.habitar();
		piolin.emitirSonido();
		piolin.esperanzaVida();
		System.out.println(piolin);

	}

}
