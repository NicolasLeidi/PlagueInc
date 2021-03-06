package Logica.Entidades;

import Logica.logica;
import Logica.Entidades.Fabricas.Fabrica;
import Logica.Estrategias.EstrategiaDisparo;

public abstract class Personaje extends Entidad{

	protected int hp, gracePeriod;
	protected EstrategiaDisparo miEstrategiaDisparo;
	protected Fabrica miFabrica;
	protected int danoInicial;
	protected int hpInicial;
	
	protected Personaje(int hp, int dano) {
		this.hp = hp;
		this.dano = dano;
		this.danoInicial = dano;
		this.hpInicial = hp;
	}
	
	public void mover() {
		super.mover();
		gracePeriod = gracePeriod > 0 ? gracePeriod - 1 : 0;
	}
	
	public void establecerAtaque(EstrategiaDisparo e) {
		miEstrategiaDisparo = e;
	}
	
	public EstrategiaDisparo obtenerAtaque() {
		return miEstrategiaDisparo;
	}
	
	public int obtenerHP() {
		return hp;
	}
	
	public void establecerHP(int n) {
		hp = n;
	}
	
	public void establecerFabrica(Fabrica miFabrica) {
		this.miFabrica = miFabrica;
		renovarDisparo();
	}
	
	public void recibirDano(int dano) {
		if(vulnerable()) {
			hp -= dano;
			if(hp <= 0)
				destruir();
			golpeado();
		}
	}
	
	protected boolean vulnerable() {
		return gracePeriod <= 0;
	}
	
	public void establecerLogica(logica juego) {
		super.establecerLogica(juego);
		miEstrategiaDisparo.establecerLogica(juego);
	}
	
	public logica obtenerLogica() {
		return juego;
	}
	
	public int obtenerDanoInicial() {
		return danoInicial;
	}
	public int obtenerVidaInicial() {
		return hpInicial;
	}
	
	
	protected void golpeado() {
		miEntidadGrafica.playSound("Golpeado");
	}
	protected abstract void renovarDisparo();
}
