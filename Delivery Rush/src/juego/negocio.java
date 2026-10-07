package juego;

import java.awt.Color;
import Entorno.entorno;
import jdk.dynalink.beans.StaticClass;

public class negocio{

    private double x;
    private double y;
    private double ancho;
    private double alto;
    private double angulo;
    private Color color;


    public  Personaje(double x, double y) {
        this.x = x;
        this.y = y;
        this.ancho = 50;
        this.alto = 50;
        this.angulo = 0;
        this.color = Color.PINK;
    }

    //creacion de la figura en el entorno//
    public void dibujarse(Entorno entorno) {
        entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, this.angulo, this.color);
    }
}
    