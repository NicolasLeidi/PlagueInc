package Logica.Entidades;

import Logica.Entidades.EntidadesGraficas.EsporaGrafica;

import Logica.Entidades.Visitors.Visitor;
import Logica.Estrategias.MovimientoProyectil;

public class Espora extends Proyectil{

	public Espora(int dano) {
		super(dano);
		miEntidadGrafica = new EsporaGrafica(0, 0);
		miEstrategiaMovimiento = new MovimientoProyectil(3, 0, 1, this);
	}

	@Override
	public void aceptar(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
