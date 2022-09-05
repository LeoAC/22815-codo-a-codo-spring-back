
package ar.com.codoacodo;

public class Main2 {

	public static void main(String[] args) {
		
		//5 km
		Auto miPrimerAuto = new Auto(5);//f3 f5		

		miPrimerAuto.encender();
		
		miPrimerAuto.acelerar();// F5
		miPrimerAuto.acelerar();// F6 con f6 voy linea por linea
		miPrimerAuto.acelerar();// f7 con f7 voy saltando hasta el q me llamo(metodo/bloque)
		miPrimerAuto.acelerar();
		miPrimerAuto.acelerar();
		
		miPrimerAuto.acelerar();
		
		System.out.println("fin");
	}

}