package Logica.Entidades;

import Logica.Entidades.EntidadesGraficas.DesinfectanteGrafica;
import Logica.Entidades.Visitors.Visitor;
import Logica.Estrategias.MovimientoVertical;

public class Desinfectante extends Proyectil{
	
	public Desinfectante(int dano) {
		super(dano);
		miEntidadGrafica = new DesinfectanteGrafica(0, 0);
		miEstrategiaMovimiento = new MovimientoVertical(3, 0, 1, this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aceptar(Visitor v) {
		v.visitar(this);
	}

	@Override
	public void impacto(Infectado entidad) {
		System.out.println("Le di a un infectado");
		destruir();
	}

	@Override
	public void impacto(Jugador entidad) {
		// TODO Auto-generated method stub
		
	}

}
