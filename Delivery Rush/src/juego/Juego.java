package juego;


import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	
	// Variables y métodos propios de cada grupo
	// ...
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Proyecto para TP", 800, 600);
		
		// Inicializar lo que haga falta para el juego
		// ...

		// Inicia el juego!
		this.entorno.iniciar();
	}

	
	public void tick()
		if (entorno.estaPresionada(entorno.TECLA_DERECHA)) {
        personaje.moverDerecha();
    }

    if (entorno.estaPresionada(entorno.TECLA_IZQUIERDA)) {
        personaje.moverIzquierda();
    }

    if (entorno.estaPresionada(entorno.TECLA_ARRIBA)) {
        personaje.moverArriba();
    }

    if (entorno.estaPresionada(entorno.TECLA_ABAJO)) {
        personaje.moverAbajo();
    }

    personaje.dibujarse(entorno);
}
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}
