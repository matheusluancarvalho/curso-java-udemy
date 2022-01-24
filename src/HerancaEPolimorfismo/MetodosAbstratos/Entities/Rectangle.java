package HerancaEPolimorfismo.MetodosAbstratos.Entities;

import HerancaEPolimorfismo.MetodosAbstratos.Entities.Enums.Color;

public class Rectangle extends Shape{

    private Double width;
    private Double height;

    //---------------------------------Construtores-------------------------------------------

    public Rectangle(){
        super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    //-----------------------------Getters e Setters-----------------------------------------

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    //-----------------------------------Métodos----------------------------------------------

    @Override
    public double area() {
        return width * height;
    }
}
