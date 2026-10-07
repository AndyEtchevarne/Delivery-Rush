package juego;

import java.awt.Color;
import entorno.Entorno;

public class Personaje {

    private double x;
    private double y;
    private double ancho;
    private double alto;
    private double angulo;
    private Color color;

    private int vidas;
    private int repartosHechos;
    private int enemigosEliminados;
    private boolean estadoReparto;

    public Personaje(double x, double y) {
        this.x = x;
        this.y = y;
        this.ancho = 50;
        this.alto = 50;
        this.angulo = 0;
        this.color = Color.RED;

        this.vidas = 3;
        this.repartosHechos = 0;
        this.enemigosEliminados = 0;
        this.estadoReparto = false;
    }

    //creacion de la figura en el entorno//
    public void dibujarse(Entorno entorno) {
        entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, this.angulo, this.color);
    }

    //Movimientos del personaje//
    public void moverDerecha() {
        if (this.x < 795) {
            this.x += 5;
        }
    }

    public void moverIzquierda() {
        if (this.x > 5) {
            this.x -= 5;
        }
    }

    public void moverArriba() {
        if (this.y > 5) {
            this.y -= 5;
        }
    }

    public void moverAbajo() {
        if (this.y < 595) {
            this.y += 5;
        }
    }


    //Creacion del metodo tomar pedido//
    public void tomarPedido() {
        // Falta completar cuando veamos la clase Negocio.
    }

    //Creacion del metodo dejar pedido//
    public void dejarPedido() {
        // Falta completar cuando veamos la clase Negocio.
    }
}