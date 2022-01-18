package Enumeracoes.Exercicio1.entities;

public class Departament {

    private String name;

    //-----------------------------------Construtores--------------------------------------

    public Departament() {
    }

    public Departament(String name) {
        this.name = name;
    }

    //---------------------------------Getters e Setters-------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
