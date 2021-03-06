package es.cfc;

import es.cfc.Utils.ProductoException;
import es.cfc.models.Producto;

public class AppMain {

	public static void main(String[] args) {
		
		Producto producto1 = new Producto(1, "Mesa", 260, "Ikea", "Mesa comedor de 12 comensales");
		Producto producto2 = new Producto(0, "Sofá", -300, "Trust", "Sofá de 3 plazas tapizado en piel azul");
		
		Producto[] productos = new Producto[2];
		productos[0] = producto1;
		productos[1] = producto2;

		System.out.println("--- Start ---");
		for (Producto producto : productos) {
			try {
				producto.comprobar();
				System.out.println("Producto y precio ok: " + producto);
			} catch (ProductoException e) {
				System.out.println("Error: " + e.getLocalizedMessage());
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("Error: " + e.getLocalizedMessage());
				e.printStackTrace();
			} finally {
				System.out.println("---");
			}
		}
		System.out.println("--- End ---");
	}

}
