package Logica.Estrategias;

import Logica.Entidades.Entidad;

public class MovimientoVertical extends EstrategiaMovimiento{

	public MovimientoVertical(int velocidad, int direccionX, int direccionY, Entidad miEntidad) {
		super(velocidad, direccionX, direccionY, miEntidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void salirsePorY() {
		miEntidad.obtenerGrafica().establecerPosicion(miEntidad.obtenerGrafica().obtenerPosicionX(), -60);
		
	}
	@Override
	protected void salirsePorXIzq() {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void salirsePorXDer() {
		// TODO Auto-generated method stub
		
	}
	
	

}
