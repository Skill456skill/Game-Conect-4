package edu.co.konrandlorenz.view;

public class SelectorIdioma {

	private static String idiomaSeleccionado;

    public static void seleccionarIdioma(String idioma) {
        setIdiomaSeleccionado(idioma);
        // Lógica para cambiar el idioma de la interfaz
    }

	public static String getIdiomaSeleccionado() {
		return idiomaSeleccionado;
	}

	public static void setIdiomaSeleccionado(String idiomaSeleccionado) {
		SelectorIdioma.idiomaSeleccionado = idiomaSeleccionado;
	}
}
