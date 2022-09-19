package ar.com.codoacodo.herencia;

public class Articulo {

	String img;
	String titulo;
	String autor;
	float precio;
	
	//alt+shift+s
	public Articulo(String img, String titulo, String autor, float precio) {
		//super();
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [img=" + img + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
			
}
