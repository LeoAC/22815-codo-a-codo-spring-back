package ar.com.codoacodo.herencia;

public class MainBuscador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//simular que el usuario escribio "algo"
		String claveDelUsuario = "iron man";
		
		Buscador miBuscador = new Buscador();		
		miBuscador.claveBusqueda = claveDelUsuario;
		
		miBuscador.buscar();
		
		//ahora que tengo los resultados en el objeto miBuscador, recorro
		//for(miBuscador.resultados) {
		/* TODO ESTO LO PASE LO PASE AL MAIN COMO METODO 
		for(Articulo aux : miBuscador.resultados) {
			System.out.println("Titulo: "+aux.titulo);
			System.out.println("Autor: "+aux.autor);
			System.out.println("Img: "+aux.img);
			System.out.println("Precio: "+aux.precio);	
		}
		*/
		miBuscador.mostrarResultados();
		
	}

}
