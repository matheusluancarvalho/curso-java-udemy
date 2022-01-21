package HerancaEPolimorfismo.entities;

public class SavingsAccount extends Account {
// Quando se coloca o final, significa que a classe n pode ser herdada

    private Double interestRate;

    //-----------------------------------Construtor--------------------------------------------

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestrate) {
        super(number, holder, balance);
        this.interestRate = interestrate;
    }

    //---------------------------------Getters e Setters----------------------------------------

    public Double getInterestrate() {
        return interestRate;
    }

    public void setInterestrate(Double interestrate) {
        this.interestRate = interestrate;
    }

    //-------------------------------------Métodos----------------------------------------------

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }

}
