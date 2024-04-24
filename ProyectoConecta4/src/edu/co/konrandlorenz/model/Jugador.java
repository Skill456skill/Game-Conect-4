package edu.co.konrandlorenz.model;

public abstract class Jugador implements Internacionalizable{
    private String nombre;
    private int puntaje;
    private char ficha;
	
	
    public Jugador(String nombre, char ficha) {
        this.nombre = nombre;
        this.setFicha(ficha);
        this.puntaje = 0;
    }
    
    public Jugador(String nombre2, int puntaje2, int i) {
		// TODO Auto-generated constructor stub
	}

	public abstract int realizarMovimiento(Tablero tablero, int columna);
	
    public void incrementarPuntaje() {
        puntaje++;
    }
  
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
    @Override
    public void cambiarIdioma(String idioma) {
        // Implementación de cambio de idioma para Jugador
    }

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntaje=" + puntaje + "]";
	}

	public char getFicha() {
		return ficha;
	}

	public void setFicha(char ficha) {
		this.ficha = ficha;
	}
	
	
	
	


}
