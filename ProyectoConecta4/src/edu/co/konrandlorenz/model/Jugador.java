package edu.co.konrandlorenz.model;

public abstract class Jugador {
	private String nombre;
	private int puntaje;
	private int numero;
	
	
    public Jugador(String nombre, int puntaje, int numero) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.numero = numero;
    }

    public abstract void realizarMovimiento(Tablero tablero, int columna);
	
    public void incrementarPuntaje() {
        puntaje++;
    }
    
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntaje=" + puntaje + "]";
	}
	
	
	
	


}
