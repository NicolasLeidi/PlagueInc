package Logica.Niveles;

import java.util.LinkedList;

import Logica.logica;
import Logica.Entidades.Entidad;
import Logica.Entidades.Fabricas.Fabrica;
import Logica.Entidades.Fabricas.FabricaAlpha;
import Logica.Entidades.Fabricas.FabricaBeta;
import Logica.Entidades.Fabricas.FabricaCuarentena;
import Logica.Entidades.Fabricas.FabricaSuperArma;
import Logica.Entidades.Fabricas.FabricaVelocidad;
import Logica.Entidades.Fabricas.FabricaVida;

public class Nivel2 extends EstadoNivel{
	

	private String fondo = "imagenes/Niveles/Fondo2.png";
	
	public Nivel2(logica juego) {
		this.juego = juego;
		fabricasEntidades = new LinkedList<Fabrica>();
		misPremios = new LinkedList<Fabrica>();
		cantidad = new LinkedList<Integer>();
		misEntidades = new LinkedList<Entidad>();
		fabricasEntidades.add(new FabricaAlpha());
		cantidad.add(6);
		fabricasEntidades.add(new FabricaBeta());
		cantidad.add(4);
		delay = 100;
		probabilidadPremio = 180;
		misPremios.add(new FabricaCuarentena());
		misPremios.add(new FabricaSuperArma());
		misPremios.add(new FabricaVelocidad());
		misPremios.add(new FabricaVida());
	}
	
	public String obtenerFondo() {
		return fondo;
	}

	@Override
	public EstadoNivel siguienteNivel() {
		return (new Nivel3(juego));
	}

	@Override
	public int obtenerNumeroNivel() {
		return 2;
	}
	
}
