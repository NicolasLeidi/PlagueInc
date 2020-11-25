package Logica.Entidades;

import Logica.Entidades.EntidadesGraficas.PremioSuperArmaGrafica;
import Logica.Entidades.Visitors.Visitor;
import Logica.Estrategias.MovimientoVertical;

public class PremioSuperArma extends PremioTemporal{
	
	public PremioSuperArma () {
		super();
		miEntidadGrafica = new PremioSuperArmaGrafica(0, 0);
		miEstrategiaMovimiento = new MovimientoVertical(3, 0, 1, this);
	}
	@Override
	public void establecerBeneficio(Jugador jugador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aceptar(Visitor v) {
		v.visitar(this);
	}

}