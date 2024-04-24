package edu.co.konrandlorenz.view;

public class Rango {
	private int rango;

    public Rango(int rango) {
        this.rango = rango;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public void mostrarRango() {
        System.out.println("Tu rango es: " + rango);
    }
}