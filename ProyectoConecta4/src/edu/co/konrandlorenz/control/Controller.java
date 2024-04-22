package edu.co.konrandlorenz.control;

import edu.co.konrandlorenz.model.GestorJuego;
import edu.co.konrandlorenz.view.Ventana;

public class Controller {
	private GestorJuego gestorJuego;
	private Ventana ventana;
	
	
	public Controller(GestorJuego gestorJuego, Ventana ventana) {
		this.gestorJuego = gestorJuego;
		this.ventana = ventana;
	}
	
	public void manejarEntrada() {
		
	}
	
	public void actualizarVista() {

	}

	
	public GestorJuego getGestorJuego() {
		return gestorJuego;
	}

	public void setGestorJuego(GestorJuego gestorJuego) {
		this.gestorJuego = gestorJuego;
	}

	public Ventana getVentana() {
		return ventana;
	}

	public void setVentana(Ventana ventana) {
		this.ventana = ventana;
	}

	@Override
	public String toString() {
		return "Controller [gestorJuego=" + gestorJuego + ", ventana=" + ventana + "]";
	}

}
