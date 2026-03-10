package util;

public class ContaBancaria {

    private double numeroConta;
    private String nomeTitular;
    private double DepositoInicial;

    public ContaBancaria(double numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public ContaBancaria(double numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.DepositoInicial = depositoInicial;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getDepositoInicial() {
        return DepositoInicial;
    }

    public void deposit (double amount) { // add valor que colocar
        DepositoInicial += amount;
    }

    public void withdraw(double amount) { // remove o valor que colocar
        DepositoInicial -= amount + 5.0;
    }

    public String toString () {
        return "Account " + numeroConta + ", Holder: " + nomeTitular + ", Balance: $ " + String.format("%.2f%n" , DepositoInicial);
    }
}
