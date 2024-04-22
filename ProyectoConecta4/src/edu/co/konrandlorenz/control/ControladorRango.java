package edu.co.konrandlorenz.control;

import edu.co.konrandlorenz.view.Rango;

public class ControladorRango {
	private Rango rango;
	
	
	public ControladorRango(Rango rango) {
		this.rango = rango;
	}

	public void actualizarRango() {


	}

	public Rango getRango() {
		return rango;
	}

	public void setRango(Rango rango) {
		this.rango = rango;
	}

	@Override
	public String toString() {
		return "ControladorRango [rango=" + rango + "]";
	}
	
	
	

}
