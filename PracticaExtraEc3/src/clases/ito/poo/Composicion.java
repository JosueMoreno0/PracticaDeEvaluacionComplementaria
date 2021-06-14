package clases.ito.poo;

import java.time.LocalDate;



public class Composicion {
	

	
	private String titulo = "";
	private float minutos = 0F;
	private float segundos = 0F;
	private String interpretesSoli ="";
	private String genero ="";
	private LocalDate fechaEstreno = null;
	private LocalDate fechaRegistro = null;
	
	
	
/////////////////////////////////////////////////////////////////

	public Composicion( String agregaInterprete, String titulo, float minutos, float segundos, String interpretesSoli, String genero,
			LocalDate fechaEstreno, LocalDate fechaRegistro) {
		
		super();
		this.titulo = titulo;
		this.minutos = minutos;
		this.segundos = segundos;
		this.interpretesSoli = interpretesSoli;
		this.genero = genero;
		this.fechaEstreno = fechaEstreno;
		this.fechaRegistro = fechaRegistro;
		
	}



/////////////////////////////////////////////////////////////////

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public float getMinutos() {
		return minutos;
	}


	public void setMinutos(float minutos) {
		this.minutos = minutos;
	}


	public float getSegundos() {
		return segundos;
	}


	public void setSegundos(float segundos) {
		this.segundos = segundos;
	}
			

	public String getInterpretesSoli() {
		return interpretesSoli;
	}


	public void setInterpretesSoli(String interpretesSoli) {
		this.interpretesSoli = interpretesSoli;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}


	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}


	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
	
	
/////////////////////////////////////////////////////////////////
	 
	@Override
	public String toString() {
		return " << COMPOSICION >> "
				+ "\n Titulo: " + titulo 
				+ "\n Minutos: " + minutos 
				+ "\n Segundos: " + segundos
				+ "\n Interpretes: " + interpretesSoli 
				+ "\n Genero: " + genero 
				+ "\n Fecha de Estreno: " + fechaEstreno
				+ "\n Fecha de Registro: " + fechaRegistro 
				+ "\n \n";
	}
	
	
/////////////////////////////////////////////////////////////////

 public int compareTo(Composicion o) {  /// CompareTo ayuda a poner canciones con el mismo titulo
			int compare=0;	
			if (this.titulo.equalsIgnoreCase(o.getTitulo()))
				compare=-1;
			else if(this.titulo.equalsIgnoreCase(o.getTitulo()))
				compare=1;
			return compare;
			
		}

}




