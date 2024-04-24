package edu.co.konrandlorenz.model;

import java.util.Scanner;

public class JugadorHumano extends Jugador{
	private Scanner scanner;
	
	public JugadorHumano(Usuario usuario) {
        super(usuario.getNombre(), usuario.getPuntaje(), 1); 
    }

	public JugadorHumano(Usuario usuario, char ficha) {
        super(usuario.getNombre(), ficha);
        setScanner(new Scanner(System.in));
    }

    @Override
    public int realizarMovimiento(Tablero tablero, int columna) {
        return tablero.colocarFicha(columna, getFicha()) ? columna : -1;
    }

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	public String toString() {
		return "JugadorHumano [scanner=" + scanner + "]";
	}


		// TODO Auto-generated constructor stub
	}

	
	

