package HerancaEPolimorfismo.entities;

public class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    //-----------------------------------Construtor--------------------------------------------
    public Account(){
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    //---------------------------------Getters e Setters----------------------------------------

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    //-------------------------------------Métodos----------------------------------------------

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }
}
