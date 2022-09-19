package ar.com.codoacodo.herencia;

public class DBUtil {
		
		Articulo[] obtenerResultado(String claveBusqueda) {
			
			Articulo primero = new Articulo("http://sitio.com.ar/img/img1.jpg",""+claveBusqueda,"AUTOR1",4390); //ctrol+espacio  activo menu
			Articulo segundo = new Articulo("http://sitio.com.ar/img/img2.jpg",""+claveBusqueda,"AUTOR1",40500); //ctrol+espacio  activo menu
			Articulo tercero = new Articulo("http://sitio.com.ar/img/img3.jpg",""+claveBusqueda,"AUTOR1",2040); //ctrol+espacio  activo menu
			
			/*
			//crear un vector/array/arreglo !
			//inician en la posicion 0
			Articulo[] resultados = new Articulo[3]; //vector vacio
			resultado[0]=primero;
			resultado[1]=segundo;
			resultado[2]=tercero;
			*/
					
			//Articulo[] res = new Articulo[] {primero,segundo,tercero}; // vector los tres datos cargados
			
			//return primero ;
			
			return new Articulo[] {primero,segundo,tercero};
			
		}
	
	
}
