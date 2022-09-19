package ar.com.codoacodo.herencia.clase6;

import ar.com.codoacodo.herencia.Articulo;

public class MainClase6 {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("/libro.jpg","Iron man","Alguien",3500);
		//libro1.
		// System.out.println(libro1);//De esta forma me va a mostrar el paquete y la ubicación de memoria (no es entendible)
//		System.out.println(libro1); // invoca al metodo tostring() de libro como no lo tiene va al padre Articulo y este va a object
	
		Articulo articulo = new Articulo("/libro.jpg","Iron Man","Alguien",3500);
//		articulo.
		
	    //Padre p = new Hijo();		
		Articulo a = new Libro("/libro.jpg","Iron Man 2","Alguien2",4500);
//      a.
		Libro libroDentroDeA = (Libro)a;
		
		Articulo[] resultados = new Articulo[2];
		resultados[0]= libro1;
		resultados[1]= articulo;
		
	}

}
