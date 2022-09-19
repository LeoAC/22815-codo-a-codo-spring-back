package ar.com.codoacodo.herencia.clase6;

import ar.com.codoacodo.herencia.Articulo;

//Si el padre tiene un constructor distinto al constructor por defecto, el hijo esta obligado a invocar dicho constuctor.-
public class Libro extends Articulo{

	//Agrego los atributos propios del libro
	private int nroPaginas;
	private String isbn;
	
	public Libro(String img, String titulo, String autor, float precio){
		//la primer linea del codigo del constructor debe ser invocar al padre
		super(img,titulo,autor,precio);
	}
	
	// Esto es sobrecarga tengo el mismo metodo con diferente cantidad de parametros
	public Libro(String img, String titulo, String autor, float precio, int nroPaginas, String isbn){		
		super(img,titulo,autor,precio);
		// Esto mismo lo hago debajo con getters y setters
		//this.nroPaginas = nroPaginas;
		//this.isbn = isbn;
		this.setNroPaginas(nroPaginas);
		this.setIsbn(isbn);
		
	}

	public int getNroPaginas() {
		return nroPaginas;
	}

	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return super.toString() + ", Libro [nroPaginas=" + nroPaginas + ", isbn=" + isbn + "]";
	}
		
}
