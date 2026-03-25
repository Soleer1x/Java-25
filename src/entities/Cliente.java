package entities;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String telefone;
    private LocalDate dataCadastro;

    public Cliente(String nome, String telefone, LocalDate dataCadastro) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
