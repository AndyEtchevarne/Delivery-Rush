package juego;

import java.awt.Color;
import entorno.Entorno;

public class enemigo {

    private double x;
    private double y;
    private double ancho;
    private double alto;
    private double angulo;
    private Color color;
    private int velocidad;

    public enemigo(double x, double y) {
        this.x = x;
        this.y = y;
        this.ancho = 50;
        this.alto = 50;
        this.angulo = 0;
        this.color = Color.GREEN;
        this.velocidad= 10;
    }

    //creacion de la figura en el entorno//
    public void dibujarse(Entorno entorno) {
        entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, this.angulo, this.color);
    }

    //Movimientos del personaje//
    public void moverDerecha() {
        if (this.x < 795) {
            this.velocidad += 5;
        }
    }

    public void moverIzquierda() {
        if (this.x > 5) {
            this.velocidad -= 5;
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

}