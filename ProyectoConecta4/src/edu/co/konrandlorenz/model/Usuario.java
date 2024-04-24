package edu.co.konrandlorenz.model;

public class Usuario implements Internacionalizable{
	private String nombre;
    private int puntaje;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0; 
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
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", puntaje=" + puntaje +
                '}';
    }

	@Override
	public void cambiarIdioma(String idioma) {
		// TODO Auto-generated method stub
		
	}
}

