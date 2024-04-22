package edu.co.konrandlorenz.model;

public class JugadorHumano extends Jugador{
	public JugadorHumano(Usuario usuario) {
        super(usuario.getNombre(), usuario.getPuntaje(), 1); 
    }

    @Override
    public void realizarMovimiento(Tablero tablero, int columna) {
        tablero.colocarFicha(columna, this.getNumero());
    }


}
