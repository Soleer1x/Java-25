package entities;

import entities.enums.Nivel;

public abstract class Funcionario {
    private String nome;
    private Nivel nivel;
    private Double salarioBase;

    public Funcionario(){

    }

    public Funcionario(String nome, Nivel nivel, Double salarioBase) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract Double calcularBonus();
}
