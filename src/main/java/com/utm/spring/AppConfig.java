package com.utm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utm.beans.Camiseta;
import com.utm.beans.Equipo;
import com.utm.beans.Jugador;
import com.utm.beans.Marca;
import com.utm.services.ServiceJugador;

public class AppConfig {
	
	public static void main(String [] args){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/utm/xml/beans.xml");//Leemos el archivo de configuracion
		ServiceJugador sj = (ServiceJugador) appContext.getBean(ServiceJugador.class);

		Marca m = new Marca();
		m.setId(3);
		
		Camiseta cam = new Camiseta();
		cam.setId(4);
		cam.setNumero(24);
		cam.setMarca(m);
		
		Equipo eq = new Equipo();
		eq.setId(5);
		eq.setNombre("Club America");
		
		Jugador jug = new Jugador();
		jug.setId(4);
		jug.setNombre("Oribe Peralta");
		jug.setEquipo(eq);
		jug.setCamiseta(cam);
		
		try {
			sj.registrarJugador(jug);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
