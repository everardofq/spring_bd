package com.utm.dao;

import com.utm.beans.Camiseta;
import com.utm.beans.Equipo;
import com.utm.beans.Jugador;
import com.utm.beans.Marca;

public interface DAOJugador {
	public void registrarMarca(Marca marca) throws Exception;
	public void registrarCamiseta(Camiseta camiseta) throws Exception;
	public void registrarEquipo(Equipo equipo) throws Exception;
	public void registrarJugador(Jugador jugador) throws Exception;
}
