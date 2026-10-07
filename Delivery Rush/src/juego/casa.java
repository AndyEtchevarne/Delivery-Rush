package juego;

import java.awt.Color;
import entorno.Entorno;

public class casa{
    private double x;
    private double y;
    private double ancho;
    private double alto;
    private double angulo;
    private Color color;
    private boolean pedidoRecibido;

    public casa(double x, double y) {
        this.x = x;
        this.y = y;
        this.ancho = 50;
        this.alto = 50;
        this.angulo = 0;
        this.color = Color.WHITE;
    }

    //creacion de la figura en el entorno//
    public void dibujarse(Entorno entorno) {
        entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, this.angulo, this.color);
    }

}