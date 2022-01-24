package HerancaEPolimorfismo.Projeto.Entities;

public class OutsourceEmployee extends Employee{

    private Double additionalCharge;

    //------------------------------------Construtor--------------------------------------------
    public OutsourceEmployee(){
        super();
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour,
                             Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    //------------------------------------Getters e Setters-------------------------------------

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    //-----------------------------------------Métodos-------------------------------------------

    @Override // Método Sobrescrito
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
