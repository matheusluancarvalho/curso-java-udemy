package TratamentoDeExcecoes.ExercicioFixacao.entities;

import TratamentoDeExcecoes.ExercicioFixacao.exceptions.BusinessException;

public class Account {

    private Integer number;
    private String hoolder;
    private Double balance;
    private Double withdrawLimit;

    public  Account(){ // Construtor vazio
    }

    public Account(Integer number, String hoolder, Double balance, Double withdrawLimit){
        this.number = number;
        this.hoolder = hoolder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }


    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }


    public String getHoolder(){
        return hoolder;
    }
    public void setHoolder(String hoolder) {
        this.hoolder = hoolder;
    }


    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    // Funções de Depositar e sacar

    public void deposit(double amount){
        balance += amount;
    }

    public void whithdraw(double amount){
        validateWhithDraw(amount);
        balance -=amount;
    }

    // Tratamento de erros

    private void validateWhithDraw(double amount){
        if (amount > getWithdrawLimit()){
            throw new BusinessException("Erro de saque: A quantia excede o limite de saque!");
        }
        if (amount > getBalance()){
            throw new BusinessException("Erro de saque: saldo insuficiente!");
        }
    }

}
