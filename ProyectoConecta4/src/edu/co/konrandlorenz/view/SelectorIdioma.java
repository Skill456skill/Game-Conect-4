package edu.co.konrandlorenz.view;

import java.util.HashMap;
import java.util.Map;

public class SelectorIdioma {
	private String idiomaSeleccionado;
    private Map<String, Map<String, String>> traducciones;

    public SelectorIdioma() {
        this.idiomaSeleccionado = "es"; // Establecer el idioma predeterminado
        this.traducciones = new HashMap<>();

        // Definir traducciones para diferentes idiomas
        Map<String, String> traduccionesEs = new HashMap<>();
        traduccionesEs.put("Bienvenido", "¡Bienvenido!");
        traduccionesEs.put("SeleccionarUsuario", "Por favor, ingresa tu nombre de usuario:");
        // Agregar más traducciones para el español según sea necesario
        this.traducciones.put("es", traduccionesEs);

        Map<String, String> traduccionesEn = new HashMap<>();
        traduccionesEn.put("Bienvenido", "Welcome!");
        traduccionesEn.put("SeleccionarUsuario", "Please enter your username:");
        // Agregar más traducciones para el inglés según sea necesario
        this.traducciones.put("en", traduccionesEn);
    }

    public String getIdiomaSeleccionado() {
        return idiomaSeleccionado;
    }

    public void setIdiomaSeleccionado(String idiomaSeleccionado) {
        this.idiomaSeleccionado = idiomaSeleccionado;
    }

    public void seleccionarIdioma(String idioma) {
        setIdiomaSeleccionado(idioma);
        // Lógica para cambiar el idioma de la interfaz
        System.out.println("Idioma seleccionado: " + idioma);
    }

    public String obtenerTraduccion(String clave) {
        Map<String, String> traduccionesActuales = traducciones.get(idiomaSeleccionado);
        if (traduccionesActuales != null) {
            return traduccionesActuales.getOrDefault(clave, "Traducción no disponible");
        }
        return "Idioma no disponible";
    }

	public Map<String, Map<String, String>> getTraducciones() {
		return traducciones;
	}

	public void setTraducciones(Map<String, Map<String, String>> traducciones) {
		this.traducciones = traducciones;
	}

	@Override
	public String toString() {
		return "SelectorIdioma [idiomaSeleccionado=" + idiomaSeleccionado + ", traducciones=" + traducciones + "]";
	}

	public SelectorIdioma(String idiomaSeleccionado, Map<String, Map<String, String>> traducciones) {
		super();
		this.idiomaSeleccionado = idiomaSeleccionado;
		this.traducciones = traducciones;
	}
    
    
}