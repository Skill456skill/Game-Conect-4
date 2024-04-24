package edu.co.konrandlorenz.control;

import edu.co.konrandlorenz.view.SelectorIdioma;

public class Idioma {
	private SelectorIdioma selectorIdioma;

	
	public Idioma(SelectorIdioma selectorIdioma) {
		this.selectorIdioma = selectorIdioma;
	}
	
	public void cambiarIdioma(String idioma) {
		// Seleccionar el idioma utilizando el SelectorIdioma asociado
        selectorIdioma.seleccionarIdioma(idioma);

        // Lógica adicional para manejar el cambio de idioma
        actualizarInterfazUsuario();
        mostrarMensajeConfirmacion(idioma);
    }

	private void actualizarInterfazUsuario() {
        // Lógica para actualizar la interfaz de usuario con las nuevas traducciones
        // Por ejemplo, aquí puedes recargar elementos de la interfaz, actualizar etiquetas de texto, etc.
        System.out.println("La interfaz de usuario se ha actualizado con las nuevas traducciones.");
    }
	
	private void mostrarMensajeConfirmacion(String idioma) {
        // Mostrar un mensaje de confirmación al usuario
        // Por ejemplo, aquí puedes mostrar un cuadro de diálogo o un mensaje en algún componente de la interfaz
        System.out.println("El idioma se ha cambiado a: " + idioma);
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
