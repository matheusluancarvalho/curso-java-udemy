package HerancaEPolimorfismo.MetodosAbstratos.Entities;

import HerancaEPolimorfismo.MetodosAbstratos.Entities.Enums.Color;

public class Circle extends Shape{

    private Double radius;

    //------------------------------------Construtores-------------------------------------------

    public Circle(){
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    //----------------------------------Getters e Setters-----------------------------------------

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    //---------------------------------------Métodos----------------------------------------------

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
