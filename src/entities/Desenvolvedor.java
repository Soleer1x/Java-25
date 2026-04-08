package entities;

import entities.enums.Nivel;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, Nivel nivel, Double salarioBase, String linguagemPrincipal) {
        super(nome, nivel, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public Double calcularBonus(){
        if(getNivel() == Nivel.SENIOR){
            return getSalarioBase() * 0.20;
        } else {
            return getSalarioBase() * 0.10;
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n")
                .append("\nFuncionário: ")
                .append(getNome())
                .append("\n (Desenvolvedor - ")
                .append(linguagemPrincipal)
                .append(") ")
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
