package ar.com.codoacodo.herencia;

public class Buscador {	
	String claveBusqueda;
	Articulo[] resultados;
	
	Buscador(){
				
	}	
	Buscador(String claveDelUsuario){
		this.claveBusqueda = claveDelUsuario;
		this.resultados = new Articulo[] {};		
	}			
	/*firma del metodo*/
	void buscar() {
		//Simular que busco en un DB		
		/* esto lo saco porque genere la clase DBUtiil		
		//al tener un constructor con parametros me da error si no los pongo ya que no usa el por defecto
		Articulo primero = new Articulo("http://sitio.com.ar/img/img1.jpg",""+claveBusqueda,"AUTOR1",4390); //ctrol+espacio  activo menu
		Articulo segundo = new Articulo("http://sitio.com.ar/img/img2.jpg",""+claveBusqueda,"AUTOR1",40500); //ctrol+espacio  activo menu
		Articulo tercero = new Articulo("http://sitio.com.ar/img/img3.jpg",""+claveBusqueda,"AUTOR1",2040); //ctrol+espacio  activo menu
		//ctrol+n
		 */		
		DBUtil db = new DBUtil();		
		// 				
		this.resultados = db.obtenerResultado(this.claveBusqueda);		
	}	
	public void mostrarResultados() { // lo mejor es que los metodos no reciban parametros q solo resuelvan todo.	
		//ahora que tengo los resultados en el objeto miBuscador, recorro
		//for(miBuscador.resultados) {
		for(Articulo aux : this.resultados) {
			System.out.println("Titulo: "+aux.titulo);
			System.out.println("Autor: "+aux.autor);
			System.out.println("Img: "+aux.img);
			System.out.println("Precio: "+aux.precio);			
			System.out.println("-----------------------");	
		}
	}	
}
