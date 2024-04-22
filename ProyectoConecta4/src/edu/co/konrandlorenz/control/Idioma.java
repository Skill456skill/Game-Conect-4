package edu.co.konrandlorenz.control;

import edu.co.konrandlorenz.view.SelectorIdioma;

public class Idioma {
	private SelectorIdioma selectorIdioma;

	
	public Idioma(SelectorIdioma selectorIdioma) {
		this.selectorIdioma = selectorIdioma;
	}
	
	public void cambiarIdioma() {
		
	}

	public SelectorIdioma getSelectorIdioma() {
		return selectorIdioma;
	}

	public void setSelectorIdioma(SelectorIdioma selectorIdioma) {
		this.selectorIdioma = selectorIdioma;
	}

	@Override
	public String toString() {
		return "Idioma [selectorIdioma=" + selectorIdioma + "]";
	}
	
	
	

}
