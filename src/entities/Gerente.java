package entities;

import entities.enums.Nivel;

public class Gerente extends Funcionario{
    private Double gratificacao;

    public Gerente(String nome, Nivel nivel, Double salarioBase, Double gratificacao) {
        super(nome, nivel, salarioBase);
        this.gratificacao = gratificacao;
    }

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }

    @Override
    public Double calcularBonus(){
        return gratificacao;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nFuncionário: ")
                .append(getNome())
                .append("\n (Gerente)")
                .append("\nNível: ")
                .append(getNivel())
                .append("\nSalário Base: R$ ")
                .append(String.format("%.2f", getSalarioBase()))
                .append("\nBônus: R$ ")
                .append(String.format("%.2f", calcularBonus()))
                .append("\nTOTAL A RECEBER: R$ ")
                .append(getSalarioBase() + calcularBonus());

        return sb.toString();
    }
}
