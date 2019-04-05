package Entidades;

import java.util.LinkedList;

public abstract class Equipo {
	protected LinkedList<Jugador> listaJugadores;
	private Jugador entrenador;
	
	
	public abstract boolean AdicionarJugador(Jugador jugador);


	public Jugador getEntrenador() {
		return entrenador;
	}


	public void setEntrenador(Jugador entrenador) {
		this.entrenador = entrenador;
	}


	public LinkedList<Jugador> getListaJugadores() {
		return listaJugadores;
	}
	
	

}
